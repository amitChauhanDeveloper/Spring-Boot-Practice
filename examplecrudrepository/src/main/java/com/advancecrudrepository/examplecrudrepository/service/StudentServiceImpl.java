package com.advancecrudrepository.examplecrudrepository.service;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancecrudrepository.examplecrudrepository.entity.Student;
import com.advancecrudrepository.examplecrudrepository.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // save operation
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // read operation
    @Override
    public List<Student> fetchStudentList() {
        return (List<Student>) studentRepository.findAll();
    }

    // update operation
    @Override
    public Student updateStudent(Student student, Long enrollNum) {
        Student stuDB = studentRepository.findById(enrollNum).get();

        if (Objects.nonNull(student.getName()) && !"".equalsIgnoreCase(student.getName())) {
            stuDB.setName(student.getName());
        }

        if (Objects.nonNull(student.getAddress()) && !"".equalsIgnoreCase(student.getAddress())) {
            stuDB.setAddress(student.getAddress());
        }

        if (Objects.nonNull(student.getMobNum()) && !"".equalsIgnoreCase(student.getMobNum())) {
            stuDB.setMobNum(student.getMobNum());
        }


        return studentRepository.save(stuDB);
    }

    // delete operation
    @Override
    public void deleteStudentById(Long enrollNum) {
        studentRepository.deleteById(enrollNum);
    }

}
