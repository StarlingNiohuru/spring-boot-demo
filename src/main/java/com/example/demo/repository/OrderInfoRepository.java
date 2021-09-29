package com.example.demo.repository;

import com.example.demo.entity.OrderInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;
public interface OrderInfoRepository extends CrudRepository<OrderInfo, Long> {
    List<OrderInfo> findByorderTimeBetween(Date startDate, Date endDate);
}
