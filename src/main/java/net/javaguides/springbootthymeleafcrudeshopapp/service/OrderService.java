package net.javaguides.springbootthymeleafcrudeshopapp.service;

import net.javaguides.springbootthymeleafcrudeshopapp.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders() ;
    void saveOrder(Order order) ;
}
