package com.dto.dtoexample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.dtoexample.dto.StudentEntityDto;
import com.dto.dtoexample.dto.StudentResponseDto;
import com.dto.dtoexample.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class StudentController {
   
	// @Autowired 
    private final StudentService studentService;

	// Save operation
	@PostMapping("/create") 

	public ResponseEntity<StudentResponseDto> saveStudentEntityDto(@RequestBody StudentEntityDto studentEntityDto)
		{

            StudentResponseDto response = studentService.saveStudentEntityDto(studentEntityDto);
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
            // return ((StudentService) studentEntityDto).saveStudentEntityDto(studentEntityDto);
        }

 
    
}




