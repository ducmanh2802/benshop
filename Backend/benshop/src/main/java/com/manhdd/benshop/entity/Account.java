package com.manhdd.benshop.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="account")
public class Account  implements Serializable{
    @Id
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
}