package com.example.week3project3.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Role;

@AllArgsConstructor
@Data
public class User {
    @NotEmpty(message = "id must not be empty")
    @Max(3)
    private int id;
    @Max(5)
    @NotEmpty(message = "must not be empty")
private String username;
    @NotEmpty(message = "must not be empty")
    @Max(6)
private  String password;
    @Email
private String email;
    @NotEmpty(message = "must not be empty")
private String role;
@NotEmpty(message = "must not be empty")
@Positive
private int balance;
}
