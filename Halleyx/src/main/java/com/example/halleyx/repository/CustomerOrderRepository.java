package com.example.halleyx.repository;

import com.example.halleyx.model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {

    @Query("SELECT c.product, SUM(c.totalAmount) FROM CustomerOrder c GROUP BY c.product")
    List<Object[]> getRevenueByProduct();

}