package com.amit.mapstructexample.mapper;

import java.time.OffsetDateTime;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.amit.mapstructexample.dto.ProductDto;
import com.amit.mapstructexample.dto.ProductResponse;
import com.amit.mapstructexample.entities.Product;

@Mapper
public interface ProductMapper {

  @Mapping(target = "createdOn", source = "createdOn")
  @Mapping(target = "updatedOn", source = "createdOn")
  @Mapping(target = "createdBy", source = "userId")
  @Mapping(target = "updatedBy", source = "userId")
  @Mapping(target = "description", source = "productDto.desc")

  Product toProductDto(ProductDto productDto,String id, OffsetDateTime createdOn,
                                       boolean isActive,String userId);

  ProductResponse toProductResponse(Product product);
 
}
