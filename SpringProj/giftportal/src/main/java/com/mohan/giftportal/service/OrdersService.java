package com.mohan.giftportal.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohan.giftportal.model.Orders;
import com.mohan.giftportal.model.Product;
import com.mohan.giftportal.repository.OrdersRepository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;


    public Orders addOrders(Orders orders) {
        return ordersRepository.save(orders);
    }

    public Orders getordersById(Long id) {
        Optional<Orders> optionalorders = ordersRepository.findById(id);
        return optionalorders.orElse(null);
    }

    public List<Orders> getAllorders() {
        return ordersRepository.findAll();
    }

    public boolean deleteordersById(Long id) {
        if (ordersRepository.existsById(id)) {
            ordersRepository.deleteById(id);
            return true;
        }
        return false;
    }

    
     public List<Orders> findOrdersByOrderDateBetween(Date startDate, Date endDate) {
        return ordersRepository.findOrdersByOrderDateBetween(startDate, endDate);
    }

    public List<Product> findProductsByRatingGreaterThan(int price) {
        return null; 
    }
}
