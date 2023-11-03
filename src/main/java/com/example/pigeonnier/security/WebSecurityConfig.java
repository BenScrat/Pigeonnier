/*
package com.example.pigeonnier.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {


    */
/**
     * Restriction des URLs selon la connexion utilisateur et leurs rôles
     *//*

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> {
            auth.requestMatchers("*.css").permitAll()

					.requestMatchers("/").permitAll()
                    .requestMatchers("/").hasAnyAuthority("ADMIN")
                    .requestMatchers(HttpMethod.GET,"/*").hasAnyAuthority("USER")
                    .anyRequest().authenticated();
        });

        http.httpBasic(Customizer.withDefaults());

        http.formLogin(
                        (form) -> form.loginPage("/login").permitAll())
                .logout((logout) -> logout.permitAll());


        return http.build();
    }
}*/
