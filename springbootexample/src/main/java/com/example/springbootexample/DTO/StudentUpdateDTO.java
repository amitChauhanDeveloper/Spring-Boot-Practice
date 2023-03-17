package com.example.springbootexample.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentUpdateDTO {
    private int studentid;
    private String studentname;
    private String studentaddress;
    private Long mobile;

}