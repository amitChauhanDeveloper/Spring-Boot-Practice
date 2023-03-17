package com.example.springbootexample.StudentService;


import java.util.List;

import com.example.springbootexample.DTO.StudentReadDTO;
import com.example.springbootexample.DTO.StudentSaveDTO;
import com.example.springbootexample.DTO.StudentUpdateDTO;

public interface StudentService {
    String addStudent(StudentSaveDTO studentSaveDTO);

    List<StudentReadDTO> getAllStudent();

    String updateStudent(StudentUpdateDTO studentUpdateDTO);

    boolean deleteStudent(int id);
}