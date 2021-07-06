package com.example.api;

import com.example.common.exception.CustomAuthenticationEntryPointException;
import com.example.common.model.CommonResult;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping(value = "/exception")
@RestController
public class ExceptionController {

    @GetMapping(value = "/entrypoint")
    public CommonResult entrypointException() {
        throw new CustomAuthenticationEntryPointException();
    }

    @GetMapping(value = "/accessDenied")
    public CommonResult accessDeniedException() {
        throw new AccessDeniedException("");
    }
}