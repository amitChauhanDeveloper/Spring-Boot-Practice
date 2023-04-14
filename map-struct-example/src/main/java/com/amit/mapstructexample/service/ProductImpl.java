package com.amit.mapstructexample.service;

import java.io.IOException;
import java.time.ZoneOffset;
import java.util.Date;
import org.springframework.stereotype.Service;
import com.amit.mapstructexample.dto.ProductDto;
import com.amit.mapstructexample.dto.ProductResponse;
import com.amit.mapstructexample.entities.Product;
import com.amit.mapstructexample.mapper.ProductMapper;
import com.amit.mapstructexample.repository.ProductRepo;
import com.zyapaar.commons.utils.SequenceGenerator;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor 
public class ProductImpl implements ProductService{

  private final ProductRepo productRepo;

  private final ProductMapper productMapper;

  @Override
  public ProductResponse createProduct(String userId, ProductDto productDto) throws IOException{

    Product product = productMapper.toProductDto(productDto,SequenceGenerator.getInstance().nextId(),
                      new Date().toInstant().atOffset(ZoneOffset.UTC),true,userId);

    Product productSave = productRepo.save(product);

    return productMapper.toProductResponse(productSave);
  }


  
}
