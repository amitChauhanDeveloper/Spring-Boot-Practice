package com.dto.dtoexample.service;

import org.springframework.stereotype.Service;
import com.dto.dtoexample.dto.StudentEntityDto;

import com.dto.dtoexample.dto.StudentResponseDto;
@Service
public interface StudentService {


	
	// Save operation
	StudentResponseDto saveStudentEntityDto(StudentEntityDto studentEntityDto);

	
	
}



