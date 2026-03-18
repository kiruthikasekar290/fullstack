package com.example.halleyx.service;

import com.example.halleyx.repository.CustomerOrderRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DashboardService {

    private final CustomerOrderRepository repository;

    public DashboardService(CustomerOrderRepository repository){
        this.repository = repository;
    }

    public List<Map<String,Object>> getRevenueByProduct(){

        List<Object[]> data = repository.getRevenueByProduct();

        List<Map<String,Object>> result = new ArrayList<>();

        for(Object[] row : data){

            Map<String,Object> map = new HashMap<>();

            map.put("name", row[0]);
            map.put("value", row[1]);

            result.add(map);
        }

        return result;
    }
}