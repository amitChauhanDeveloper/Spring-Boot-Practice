package com.example.registration.register.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class ReadUserByIdDTO {

    private UUID id;
    private String fname;
    private String lname;
    private Long mobile;
    private String email;
    private String address;
}
