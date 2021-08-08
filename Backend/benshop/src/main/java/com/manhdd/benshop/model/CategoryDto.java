package com.manhdd.benshop.model;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto implements Serializable{
  @NotEmpty
  private Integer categoryId;
  @NotEmpty
  @Min(value = 5)
  private String name;

}
