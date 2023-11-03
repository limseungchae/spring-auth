package com.example.springauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration // 빈구성 관련 설정 제공
public class PasswordConfig {

    @Bean // 컨테이너 등록
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
