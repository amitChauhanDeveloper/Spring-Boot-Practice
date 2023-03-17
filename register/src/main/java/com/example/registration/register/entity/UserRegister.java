package com.example.registration.register.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class UserRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private UUID id;
    //private String id;
    private String fname;
    private String lname;
    private Long mobile;
    private String email;
    private String address;
    private String password;
    private Boolean isActive;
}
