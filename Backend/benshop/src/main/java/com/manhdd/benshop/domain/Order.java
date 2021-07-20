package com.manhdd.benshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private int orderId;
    private Date orderDate;
    private int customerId;
    private double amount;
    private short status;
}