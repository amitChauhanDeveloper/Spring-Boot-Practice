package com.advancecrudrepository.examplecrudrepository.repository;

import org.springframework.data.repository.CrudRepository;

import com.advancecrudrepository.examplecrudrepository.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Long>{
    
}
