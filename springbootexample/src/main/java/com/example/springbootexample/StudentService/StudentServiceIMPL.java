package com.example.springbootexample.StudentService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootexample.DTO.StudentReadDTO;
import com.example.springbootexample.DTO.StudentSaveDTO;
import com.example.springbootexample.DTO.StudentUpdateDTO;
import com.example.springbootexample.StudentRepo.StudentRepo;
import com.example.springbootexample.entity.Student;

@Service
public class StudentServiceIMPL implements StudentService
{
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public String addStudent(StudentSaveDTO studentSaveDTO)
    {
        Student student = new Student(

                0, studentSaveDTO.getStudentname(),
                studentSaveDTO.getStudentaddress(),
                studentSaveDTO.getMobile()
        );
        studentRepo.save(student);
        return student.getStudentname();
    }

    @Override
    public List<StudentReadDTO> getAllStudent() {
       List<Student> getStudent = studentRepo.findAll();
       List<StudentReadDTO> studentDTOList = new ArrayList<>();
       for(Student a:getStudent)
       {
           StudentReadDTO studentDTO = new StudentReadDTO(

                   a.getStudentid(),
                   a.getStudentname(),
                   a.getStudentaddress(),
                   a.getMobile()
           );
           studentDTOList.add(studentDTO);
       }

       return  studentDTOList;
    }

    @Override
    public String updateStudent(StudentUpdateDTO studentUpdateDTO)
    {
        if (studentRepo.existsById(studentUpdateDTO.getStudentid())) {
            Student student = studentRepo.getById(studentUpdateDTO.getStudentid());


            student.setStudentname(studentUpdateDTO.getStudentname());
            student.setStudentaddress(studentUpdateDTO.getStudentaddress());
            student.setMobile(studentUpdateDTO.getMobile());
            studentRepo.save(student);
        }
            else
            {
                System.out.println("Student ID do not Exist");
            }

                return null;
        }

    @Override
    public boolean deleteStudent(int id) {

        if(studentRepo.existsById(id))
        {
            studentRepo.deleteById(id);
        }
        else
        {
            System.out.println("student id not found");
        }

        return true;
    }
}