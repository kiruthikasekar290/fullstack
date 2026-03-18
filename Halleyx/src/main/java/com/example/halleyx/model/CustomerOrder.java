package com.example.halleyx.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    private String streetAddress;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    private String product;

    private int quantity;
    private double unitPrice;
    private double totalAmount;

    private String status;
    private String createdBy;

    private LocalDateTime orderDate;

    @PrePersist
    public void beforeSave(){
        this.totalAmount = this.quantity * this.unitPrice;
        this.orderDate = LocalDateTime.now();
    }
}