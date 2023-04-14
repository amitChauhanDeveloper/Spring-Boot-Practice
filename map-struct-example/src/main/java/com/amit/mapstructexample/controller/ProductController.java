package com.amit.mapstructexample.controller;

import java.io.IOException;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import com.amit.mapstructexample.dto.ProductDto;
import com.amit.mapstructexample.dto.ProductResponse;


@RequestMapping("api/v1/")
public interface ProductController {

  @PostMapping("/product")
  ResponseEntity<ProductResponse> createProduct(@RequestHeader ("Z-AUTH-USERID")String userId,
  @RequestBody @Valid ProductDto productDto) 
  throws IOException;

  
}
