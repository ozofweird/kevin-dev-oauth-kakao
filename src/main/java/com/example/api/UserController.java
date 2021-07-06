package com.example.api;

import com.example.application.KakaoService;
import com.example.common.exception.CustomUserExistsException;
import com.example.common.exception.CustomUserNotFoundException;
import com.example.common.model.CommonResult;
import com.example.common.model.ResponseService;
import com.example.common.model.SingleResult;
import com.example.config.security.JwtTokenProvider;
import com.example.domain.User;
import com.example.domain.UserRepository;
import com.example.dto.KakaoProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/v1")
@RestController
public class UserController {

    private final ResponseService responseService;
    private final UserRepository userRepository;

    private final JwtTokenProvider jwtTokenProvider;
    private final KakaoService kakaoService;

    @GetMapping("/signin/{provider}")
    public SingleResult<String> singinByProvider(@PathVariable String provider, @RequestParam String accessToken) {
        KakaoProfile profile = kakaoService.getKakaoProfile(accessToken);
        User user = userRepository.findByUidAndProvider(String.valueOf(profile.getId()), provider).orElseThrow(CustomUserNotFoundException::new);
        return responseService.getSingleResult(
                jwtTokenProvider.createToken(
                        String.valueOf(user.getMsrl()),
                        user.getRoles()
                )
        );
    }

    @GetMapping("/signup/{provider}")
    public CommonResult singupProvider(@PathVariable String provider, @RequestParam String accessToken, @RequestParam String name) {
        if(provider.equals("kakao")) {
            KakaoProfile profile = kakaoService.getKakaoProfile(accessToken);
            Optional<User> user = userRepository.findByUidAndProvider(String.valueOf(profile.getId()), provider);
            if (user.isPresent()) throw new CustomUserExistsException();

            userRepository.save(User.builder()
                    .uid(String.valueOf(profile.getId()))
                    .provider(provider)
                    .name(name)
                    .roles(Collections.singletonList("ROLE_USER"))
                    .build());
        }

        if(provider.equals("facebook")) {

        }
        return responseService.getSuccessResult();
    }

    @GetMapping("/user")
    public SingleResult<User> findUserById(@RequestParam(defaultValue = "ko") String lang) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String id = authentication.getName();
        return responseService.getSingleResult(userRepository.findByUid(id).orElseThrow(CustomUserNotFoundException::new));
    }
}
