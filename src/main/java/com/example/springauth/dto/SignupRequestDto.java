package com.example.springauth.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequestDto {
    private String username;
    private String password;
    private String email;
    private boolean admin = false; // 사용자가 관리자인지 나타내는 불리언 값 기본 false
    private String adminToken = ""; // 관리자 권한 부여받을경우 토큰 저장
}