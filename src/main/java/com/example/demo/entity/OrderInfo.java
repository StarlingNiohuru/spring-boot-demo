package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
//@Table(name = "`order`")
public class OrderInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private String postcode;
    private Date orderTime;
    private int orderType;
    private String remark;
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;
    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;
    @OneToMany(mappedBy = "orderInfo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderItem> orderItems;

    public Long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getPostcode() {
        return postcode;
    }

    public Date getOrder_time() {
        return orderTime;
    }

    public int getOrder_type() {
        return orderType;
    }

    public String getRemark() {
        return remark;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", order_time=" + orderTime +
                ", order_type=" + orderType +
                ", customer=" + customer +
                '}';
    }
}
