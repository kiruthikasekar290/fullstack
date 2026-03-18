package com.example.halleyx.controller;

import com.example.halleyx.model.CustomerOrder;
import com.example.halleyx.service.CustomerOrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerOrderController {

    private final CustomerOrderService service;

    public CustomerOrderController(CustomerOrderService service) {
        this.service = service;
    }

    @PostMapping
    public CustomerOrder createOrder(@RequestBody CustomerOrder order) {
        return service.save(order);
    }

    @GetMapping
    public List<CustomerOrder> getOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/{id}")
    public CustomerOrder getOrder(@PathVariable Long id) {
        return service.getOrder(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}