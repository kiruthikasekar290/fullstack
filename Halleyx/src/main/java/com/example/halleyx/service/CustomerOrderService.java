package com.example.halleyx.service;

import com.example.halleyx.model.CustomerOrder;
import com.example.halleyx.repository.CustomerOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerOrderService {

    private final CustomerOrderRepository repository;

    public CustomerOrderService(CustomerOrderRepository repository) {
        this.repository = repository;
    }

    public CustomerOrder save(CustomerOrder order) {
        return repository.save(order);
    }

    public List<CustomerOrder> getAllOrders() {
        return repository.findAll();
    }

    public CustomerOrder getOrder(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}