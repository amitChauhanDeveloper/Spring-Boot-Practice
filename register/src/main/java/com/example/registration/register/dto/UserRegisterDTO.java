package com.example.registration.register.dto;

import org.hibernate.validator.constraints.Range;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserRegisterDTO {

    private UUID id;
    //private String id;

    @NotNull(message="first name may not be null")
    @Size(min = 2, message = "Please enter name with more than 2 letters")
    @Size(max = 100, message = "please enter name with less than 2 letters")
    private String fname;

    @NotNull(message="last name may not be null")
    @Size(min = 2, message = "Please enter name with more than 2 letters")
    @Size(max = 100, message = "please enter name with less than 2 letters")
    private String lname;

    @NotNull(message="mobile number may not be null")
    @Range(min = 1000000000L)
    @Range(max = 9999999999L)
    private Long mobile;

    @NotNull(message="email may not be null")
    private String email;
    
    @NotNull(message="email may not be null")
    @Size(max = 500, message = "enter valid address length")
    private String address;
    
    @NotNull(message="password may not be null")
    private String password;

    private Boolean isActive;
    
}
