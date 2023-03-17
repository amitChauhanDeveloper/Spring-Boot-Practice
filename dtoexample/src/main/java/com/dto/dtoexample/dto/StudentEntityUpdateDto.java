package com.dto.dtoexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntityUpdateDto {
    
    private String id;
    private String name;
    private String address;
    private Long mobileNo;
    private String password;

}

