package org.krasnoschek.config;

import org.krasnoschek.CustomUserDetailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class Beans {

    @Bean
    public UserDetailsService userDetailsService(){
        return new CustomUserDetailService();
    }

}
