package com.fitness.userservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank(message = "Email cant be null" )
    @Email(message = "Invalid format")
    private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "password must have 6 characters")
    private String password;
    private String firstName;
    private String lastName;
}
