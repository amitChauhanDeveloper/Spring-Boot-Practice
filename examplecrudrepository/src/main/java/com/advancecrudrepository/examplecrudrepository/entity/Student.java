package com.advancecrudrepository.examplecrudrepository.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="CRUD_REPO")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long enrollNum;

    @NotEmpty(message = "Name must not be empty")
    private String name;

    @NotEmpty(message = "Address must not be empty")
    private String address;

    @NotEmpty(message = "Mobile Number must not be empty")
    private String mobNum;

    private boolean isActive;
    
}


