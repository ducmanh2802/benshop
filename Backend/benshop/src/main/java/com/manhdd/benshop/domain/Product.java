package com.manhdd.benshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    private int productId;
    private String name;
    private int quantity;
    private double unitPrice;
    private String image;
    private String description;
    private double discount;
    private Date enteredDate;
    private short status;
    private int categoryId;
}