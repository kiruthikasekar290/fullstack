package com.example.halleyx.controller;

import com.example.halleyx.service.DashboardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dashboard")
@CrossOrigin(origins = "http://localhost:3000")
public class DashboardController {

    private final DashboardService service;

    public DashboardController(DashboardService service){
        this.service = service;
    }

    @GetMapping("/chart")
    public List<Map<String,Object>> getChartData(){

        return service.getRevenueByProduct();

    }
}