# kevin-dev-oauth-kakao

![](https://img.shields.io/badge/version-0.0.1-brightgreen)

## π Index
- [About](#π-about)
- [Overview](#π-overview)
- [Getting Started](#π-getting-started)
- [Release Notes](#β-release-notes)
- [Issues](#π₯-issues)
- [Contributing](#π₯-contributing)
- [Authors](#π€-authors)
- [License](#π·-license)
- [References](#π-references)
- [Commit Message (Gitmoji)](#βοΈ-commit-messages-gitmoji)

## π About
μΉ΄μΉ΄μ€ μμ λ‘κ·ΈμΈμ κ΅¬νν νλ‘μ νΈμλλ€. ν΄λΌμ΄μΈνΈμμ μ λ¬ν΄μ£Όλ 'access_token' νΉμ 'refresh_token'μ κ²μ¦νμ¬ μ μ μ μ λ³΄λ₯Ό κ°μ Έμ€λλ°μ λͺ©μ μ κ°μ§κ³  μμ΅λλ€.

## π Overview
* μΉ΄μΉ΄μ€ Login
  * λ‘κ·ΈμΈ νλ©΄ λ¦¬λ€μ΄λ νΈ (kakaoLogin / redirectKakao)
  * 'access_token'μ μ΄μ©νμ¬ νμ κ°μ, λ‘κ·ΈμΈ, νμ μ‘°ν (singinByProvider / singupProvider / findUserById)

* Response(λ¨μΌ κ²°κ³Ό, λ€μ€ κ²°κ³Ό) λ° μμΈ μ²λ¦¬
* Security μ€μ 

## π Getting Started
**λ‘κ·ΈμΈ νλ‘μΈμ€**

![](./docs/images/oauth_1.png)

**Dependencies.**
```
implementation 'org.springframework.boot:spring-boot-starter-freemarker'
implementation 'org.springframework.boot:spring-boot-starter-validation'
implementation group: 'io.jsonwebtoken', name: 'jjwt', version: '0.9.1'
implementation 'com.google.code.gson:gson'
implementation 'net.rakugakibox.util:yaml-resource-bundle:1.1'
```

### πΉ Environment
- Local

## β Release Notes
* 0.0.1
    * νμ€νΈ

## π₯ Issues

## π₯ Contributing
ozofweird

## π€ Authors
- [ozofweird](https://github.com/ozofweird) - **Kevin Ahn**

## π· License
ozofweird

## π References
- https://daddyprogrammer.org/post/1012/springboot2-rest-api-social-login-kakao/

---

## βοΈ Commit messages (Gitmoji)

|Gitmoji|Code|Description|
|:-----:|:---:|:--------:|
|π¨|art|νμΌ/μ½λ κ΅¬μ‘° κ°μ |
|π©Ή|adhesive_bandage|κ°λ¨ν μμ |
|β‘οΈ|zap|μ±λ₯ ν₯μ|
|π₯οΈ|fire|μ½λλ νμΌ μ­μ |
|ποΈ|bug|λ²κ·Έ ν΄κ²°|
|ποΈ|ambulance|κΈ΄κΈ μμ |
|β¨οΈ|sparkles|μλ‘μ΄ κΈ°λ₯|
|ποΈ|memo|λ¬Έμ μΆκ°/μμ |
|ποΈ|lipstick|νλ©΄ UI μΆκ°/μμ |
|ποΈ|tada|νλ‘μ νΈ μμ|
|βοΈ|white_check_mark|νμ€νΈ μΆκ°/μμ |
|ποΈ|lock|λ³΄μ μ΄μ μμ |
|ποΈ|bookmark|λ¦΄λ¦¬μ¦/λ²μ  νκ·Έ|
|π§|construction|μμ μ§ν μ€|
|π|green_heart|CI λΉλ μμ |
|β¬οΈ|arrow_down|μμ‘΄μ± λ²μ  λ€μ΄|
|β¬οΈ|arrow_up|μμ‘΄μ± λ²μ  μ|
|π|pushpin|νΉμ  λ²μ  μμ‘΄μ± κ³ μ |
|π·|construction_worker|CI λΉλ μμ€ν μΆκ°/μμ |
|π|chart_with_upwards_trend|λΆμ, μΆμ  μ½λ μΆκ°/μμ |
|β»οΈ|recycle|μ½λ λ¦¬ν©ν λ§|
|β|heavy_plus_sign|μμ‘΄μ± μΆκ°|
|β|heavy_minus_sign|μμ‘΄μ± μ κ±°|
|π§|wrench|μ€μ  νμΌ μΆκ°/μμ |
|π¨|hammer|κ°λ° μ€ν¬λ¦½νΈ μΆκ°/μμ |
|π|globe_with_meridians|λ€κ΅­μ΄ μ§μ|
|π©|poop|μμ’μ μ½λ μΆκ°|
|βͺ|rewind|λ³κ²½ λ΄μ© λλλ¦¬κΈ°|
|π|twisted_rightwards_arrows|λΈλμΉ ν©λ³|
|π½|alien|μΈλΆ API λ³νλ‘ μΈν μμ |
|π|truck|λ¦¬μμ€ μ΄λ/μ΄λ¦ λ³κ²½|
|π₯|boom|λλΌμ΄ κΈ°λ₯ μκ°|
|π±|bento|μμ μΆκ°/μμ |
|π‘|bulb|μ£Όμ μΆκ°/μμ |
|π¬|speech_balloon|μ€νΈλ§ νμΌ μΆκ°/μμ |
|π|card_file_box|λ°μ΄λ²λ² μ΄μ€ κ΄λ ¨ μμ |
|π|loud_sound|λ‘κ·Έ μΆκ°/μμ |
|π|mute|λ‘κ·Έ μ­μ |
|π±|iphone|λ°μν λμμΈ|
|π|see_no_evil|gitignore μΆκ°|