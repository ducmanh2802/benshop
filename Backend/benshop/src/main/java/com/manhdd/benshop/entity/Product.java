package com.manhdd.benshop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    @Column(name = "name")
    private String name;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "unit_price")
    private double unitPrice;
    @Column(name = "image")
    private String image;
    @Column(name = "description")
    private String description;
    @Column(name = "discount")
    private double discount;
    @Column(name = "entered_date")
    private Date enteredDate;
    @Column(name = "status")
    private short status;
    @Column(name = "category_id")
    private int categoryId;
}