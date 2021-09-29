package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.entity.OrderInfo;
import com.example.demo.service.CustomerService;
import com.example.demo.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderInfoController {
    @Autowired
    private OrderInfoService orderInfoService;

    @RequestMapping("/stats")
    public Map dashboard() {
        Map<String, ArrayList> map = new HashMap<>();
        ArrayList<String> labels = new ArrayList<>();
        labels.add("2020-09-21");
        labels.add("2020-09-22");
        labels.add("2020-09-23");
        ArrayList<Integer> datasets = new ArrayList<>();
        datasets.add(23);
        datasets.add(42);
        datasets.add(31);
        map.put("labels", labels);
        map.put("datasets", datasets);
        return map;
//        return orderInfoService.findByOrderTimeBetween();
    }
}
