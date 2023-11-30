package com.projectTBS.employeesmicroservice.models;

import lombok.Data;

@Data
public class AuthenticationResponse {
    private String message;
    private String email;
    private String role;

    public AuthenticationResponse(String message,String email, String role) {
        this.message = message;
        this.email=email;
        this.role = role;
    }

    // Getters et setters
}