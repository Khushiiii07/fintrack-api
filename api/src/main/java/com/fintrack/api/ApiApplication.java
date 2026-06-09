/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fintrack.api;

/**
 *
 * @author Khushi
 */
import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ApiApplication.class);
        
        // This explicitly forces Spring Boot to run on Port 9090 right inside the code!
        app.setDefaultProperties(Collections.singletonMap("server.port", "9090"));
        
        app.run(args);
    }
}