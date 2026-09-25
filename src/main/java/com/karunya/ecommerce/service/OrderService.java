package com.karunya.ecommerce.service;

import com.karunya.ecommerce.model.Order;
import com.karunya.ecommerce.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order) {
        if (order.getStatus() == null || order.getStatus().isEmpty()) {
            order.setStatus("PLACED");
        }

        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order updateOrderStatus(Long id, String status) {
        Order order = orderRepository.findById(id).orElse(null);

        if (order != null) {
            order.setStatus(status);
            return orderRepository.save(order);
        }

        return null;
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}