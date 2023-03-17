package com.dto.dtoexample.service;

import java.util.UUID;
import org.springframework.stereotype.Service;
import com.dto.dtoexample.dto.StudentEntityDto;
import com.dto.dtoexample.dto.StudentResponseDto;
import com.dto.dtoexample.entity.Student;
import com.dto.dtoexample.mapper.StudentMapper;
import com.dto.dtoexample.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

    // @Autowired
    // private StudentRepository studentRepository;
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    //Save Operation
    @Override
    public StudentResponseDto saveStudentEntityDto(StudentEntityDto studentEntityDto){

        Student student = new Student();


        /* student.setEnrollId(UUID.randomUUID().toString());
        student.setName(studentEntityDto.getName());
        student.setAddress(studentEntityDto.getAddress());
        student.setMobileNum(studentEntityDto.getMobileNo());
        student.setPassword(studentEntityDto.getPassword());
        student.setIsActive(true); */

        student = studentMapper.toStudentFromStudentEntityDto(studentEntityDto, UUID.randomUUID().toString(), true);

        studentRepository.save(student);

        StudentResponseDto responseDto = new StudentResponseDto();

        responseDto = studentMapper.toStudentResponseDto(student);
        // responseDto.setId(student.getEnrollId());
        // responseDto.setName(student.getName());

        return responseDto;

        // return studentRepository.save(studentEntityDto);   
    }  

    
}
