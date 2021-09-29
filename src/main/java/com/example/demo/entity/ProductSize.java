package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class ProductSize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int surcharge;
    @OneToMany(mappedBy = "productSize", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderItem> orderItems;
}
