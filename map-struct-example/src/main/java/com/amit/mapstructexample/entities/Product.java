package com.amit.mapstructexample.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

  @Id
  private int id;
  private String name;
  private String description;
  private int quantity;
  private long price;

  
}
