package com.example.springbootexample.StudentRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.example.springbootexample.entity.Student;

@EnableJpaRepositories
//@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
}