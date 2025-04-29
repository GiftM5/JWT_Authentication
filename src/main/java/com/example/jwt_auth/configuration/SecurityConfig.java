package com.example.jwt_auth.configuration;

 /*Starting with : SecurityConfig defines the security settings for the application.
        * It configures which HTTP requests are secured, and how users should be authenticated.
        *
        * For this simple authentication example:
        * - CSRF protection is disabled (because we are building a stateless REST API).
        * - The "/authenticate" endpoint is made publicly accessible (no authentication required).
        * - All other endpoints would require authentication (in a full app).
        */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/authenticate").permitAll()
                        .anyRequest().authenticated()
                );
        return http.build();
    }
}
