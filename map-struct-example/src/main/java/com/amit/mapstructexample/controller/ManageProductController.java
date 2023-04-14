package com.amit.mapstructexample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.amit.mapstructexample.dto.ProductDto;
import com.amit.mapstructexample.dto.ProductResponse;
import com.amit.mapstructexample.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import java.io.IOException;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ManageProductController implements ProductController {

  private final ProductService productService;

  @Override
  public ResponseEntity<ProductResponse> createProduct (String userId,
  ProductDto productDto) throws IOException{
    
    ProductResponse productResponse = productService.createProduct(userId, productDto);
    return ResponseEntity.status(HttpStatus.CREATED).body(productResponse);
  }
  
}
