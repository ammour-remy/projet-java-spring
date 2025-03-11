package com.TemplateRes.template_res.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean //permet de définir un WebMvcConfigurer qui sera chargé automatiquement par Spring au démarrage
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // Applique CORS aux routes API
                        .allowedOrigins("http://localhost:4200") // Autorise Angular en local
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // Méthodes HTTP autorisées
                        .allowedHeaders("Content-Type", "Authorization") // Sécurisation des headers
                        .allowCredentials(true); // Permet d'envoyer des cookies JWT
            }
        };
    }
}
