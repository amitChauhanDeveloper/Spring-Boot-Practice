package com.advancecrudrepository.examplecrudrepository.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.advancecrudrepository.examplecrudrepository.entity.Student;
import com.advancecrudrepository.examplecrudrepository.service.StudentService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Save operation
    @PostMapping("/addStudents")
    public Student saveStudent(
          @Valid @RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    // Read operation
    @GetMapping("/readStudents")
    public List<Student> fetchStudentList() {

        return studentService.fetchStudentList();
    }

    // Update operation
    @PutMapping("/updateStudents/{id}")
    public Student updateDepartment(@RequestBody Student student,
            @PathVariable("id") Long enrollNum) {

        return studentService.updateStudent(
                student, enrollNum);
    }

    // Delete operation
    @DeleteMapping("/deleteStudents/{id}")
    public String deleteStudentById(@PathVariable("id") Long enrollNum) {

        studentService.deleteStudentById(
                enrollNum);
        return "Deleted Successfully";
    }
}
