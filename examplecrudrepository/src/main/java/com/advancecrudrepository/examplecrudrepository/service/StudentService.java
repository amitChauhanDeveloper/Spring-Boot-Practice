package com.advancecrudrepository.examplecrudrepository.service;

import java.util.List;

import com.advancecrudrepository.examplecrudrepository.entity.Student;

public interface StudentService {
    
	// save operation
	Student saveStudent(Student student);

	// read operation
	List<Student> fetchStudentList();

	// update operation
	Student updateStudent(Student student, Long enrollNum);

	// delete operation
	void deleteStudentById(Long studentId);


}
