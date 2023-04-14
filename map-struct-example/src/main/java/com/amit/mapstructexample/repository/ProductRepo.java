package com.amit.mapstructexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.amit.mapstructexample.entities.Product;

public interface ProductRepo extends JpaRepository<Product,String> {
  
}
