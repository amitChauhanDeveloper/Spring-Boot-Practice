package com.example.springbootexample.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootexample.DTO.StudentReadDTO;
import com.example.springbootexample.DTO.StudentSaveDTO;
import com.example.springbootexample.DTO.StudentUpdateDTO;
import com.example.springbootexample.StudentService.StudentService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/student")
public class StudentController
{
    @Autowired
    private StudentService studentService;
 
    @PostMapping(path = "/save")
 
    public String savestudent(@RequestBody StudentSaveDTO studentSaveDTO)
    {
        String id = studentService.addStudent(studentSaveDTO);
        return id;
    }
 
    @GetMapping(path = "/getAllStudent")
    public List<StudentReadDTO> getAllStudent()
    {
       List<StudentReadDTO>allStudents = studentService.getAllStudent();
       return allStudents;
    }
 
    @PutMapping(path = "/update")
 
    public String updateStudent(@RequestBody StudentUpdateDTO studentUpdateDTO)
    {
        String id = studentService.updateStudent(studentUpdateDTO);
        return id;
    }
 
    @DeleteMapping(path = "/deletestudent/{id}")
    public String deleteStudent(@PathVariable(value = "id") int id)
    {
        boolean deletestudent = studentService.deleteStudent(id);
        return "deleted";
    }
 
}