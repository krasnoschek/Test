package org.krasnoschek.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExceptionHandlingConfigurer;
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebMvcSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("58812396").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //disable csrf
        http.csrf().disable();

        FormLoginConfigurer<HttpSecurity> form = http.authorizeRequests().anyRequest().authenticated().and().formLogin();
        ExceptionHandlingConfigurer<HttpSecurity> exceptions = http.exceptionHandling();

        //setting login parameters
        form.passwordParameter("password");
        form.usernameParameter("login");
        //on fail login operation
        form.failureHandler((request, response, exception) -> response.setStatus(403));
        //on success login operation
        form.successHandler((request, response, authentication) -> response.setStatus(200));
        //on access denied
        exceptions.accessDeniedHandler((request, response, accessDeniedException) -> response.setStatus(403));
        //on unauthorizad
        exceptions.authenticationEntryPoint((request, response, authException) -> response.setStatus(401));
    }
}
