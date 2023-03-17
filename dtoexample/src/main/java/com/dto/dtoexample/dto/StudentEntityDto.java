package com.dto.dtoexample.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntityDto {
    
    @NotNull
    @Size(min = 2, message = "Please enter name with more than 2 letters")
    @Size(max = 100, message = "please enter name with less than 2 letters")
    private String name;

    @Size(max = 500, message = "enter valid address length")
    private String address;

    @Range(min = 1000000000L)
    @Range(max = 9999999999L)
    // @Pattern(regexp = "^[1-9]{1}[0-9]{9}$", message = "enter valid mobile number")
    private Long mobileNo;

    private String password;
}

