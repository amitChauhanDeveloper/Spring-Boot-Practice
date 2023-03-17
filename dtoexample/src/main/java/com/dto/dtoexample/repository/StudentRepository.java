package com.dto.dtoexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dto.dtoexample.entity.Student;

public interface StudentRepository extends JpaRepository<Student,String>{


}
