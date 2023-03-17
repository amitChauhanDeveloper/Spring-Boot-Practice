package com.dto.dtoexample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student_tbl")
public class Student {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enroll_id")
    private String enrollId;
    private String name;
    private String address;

    @Column(name = "mobile_number")
    private Long mobileNum;
    private String password;

    @Column(name = "is_active")
    private Boolean isActive;



}
