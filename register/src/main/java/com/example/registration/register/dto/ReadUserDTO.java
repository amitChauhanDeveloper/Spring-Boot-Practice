package com.example.registration.register.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class ReadUserDTO {

    private String fname;
    private String lname;
    private Long mobile;
    private String email;
    private String address;
}
