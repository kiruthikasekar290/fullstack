package com.example.halleyx.controller;

import com.example.halleyx.model.Widget;
import com.example.halleyx.service.WidgetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/widgets")
@CrossOrigin(origins = "http://localhost:3000")
public class WidgetController {

    private final WidgetService service;

    public WidgetController(WidgetService service) {
        this.service = service;
    }

    @PostMapping
    public Widget createWidget(@RequestBody Widget widget) {
        return service.save(widget);
    }

    @GetMapping
    public List<Widget> getWidgets() {
        return service.getAllWidgets();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}