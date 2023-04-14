package com.amit.mapstructexample.service;

import java.io.IOException;
import com.amit.mapstructexample.dto.ProductDto;
import com.amit.mapstructexample.dto.ProductResponse;

public interface ProductService {


 ProductResponse createProduct (String userId,ProductDto productDto) throws IOException;
 
  
}
