package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity;
    @ManyToOne(fetch = FetchType.LAZY)
    private OrderInfo orderInfo;
    @ManyToOne(fetch = FetchType.LAZY)
    private ProductType productType;
    @ManyToOne(fetch = FetchType.LAZY)
    private ProductSize productSize;
}
