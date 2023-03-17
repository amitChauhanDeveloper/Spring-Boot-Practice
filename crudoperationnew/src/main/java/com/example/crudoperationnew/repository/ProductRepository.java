package com.example.crudoperationnew.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudoperationnew.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product findByName(String name);
    
}
