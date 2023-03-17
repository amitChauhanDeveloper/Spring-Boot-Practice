package com.example.springbootexample.DTO;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentSaveDTO {

    private int studentid;

    @NotNull
    @Size(min = 2, message = "Please enter name with more than 2 letters")
    @Size(max = 100, message = "please enter name with less than 2 letters")
    private String studentname;

    @Size(max = 500, message = "enter valid address length")
    private String studentaddress;
    
    @Range(min = 1000000000L)
    @Range(max = 9999999999L)
    private Long mobile;

}