package com.mbsystems.ch03ex01.config;

import com.mbsystems.ch03ex01.domain.SecurityUser;
import com.mbsystems.ch03ex01.service.InMemoryBmkUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Configuration
public class ChoeEx01Config {

    @Bean
    public UserDetailsService userDetailsService() {
        SecurityUser securityUser = new SecurityUser( "basil", "12345", "R$EAD" );

        List<SecurityUser> securityUserList = List.of( securityUser );

        return new InMemoryBmkUserDetailsService( securityUserList );
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
