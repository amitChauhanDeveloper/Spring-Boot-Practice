package com.amit.mapstructexample.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.amit.mapstructexample.dto.ProductDto;
import com.amit.mapstructexample.entities.Product;

@Mapper
public interface ProductMapper {

  ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
  
  ProductDto entitiesToProductDto(Product product);

  Product dtoToentities(ProductDto productDto);
}
