package com.example.springbootexample.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentReadDTO {


    private int studentid;
    private String studentname;
    private String studentaddress;
    private Long mobile;

}