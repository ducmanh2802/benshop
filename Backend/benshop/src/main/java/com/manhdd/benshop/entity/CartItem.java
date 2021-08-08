package com.manhdd.benshop.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    private int productId;
    private String name;
    private int quantity;
    private double unitPrice;

}