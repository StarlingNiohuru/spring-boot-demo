package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.entity.OrderInfo;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.OrderInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderInfoService {
    @Autowired
    private OrderInfoRepository orderInfoRepository;

    public List<OrderInfo> findByOrderTimeBetween(Date startDate, Date endDate) {
        return orderInfoRepository.findByorderTimeBetween(startDate, endDate);
    }

}
