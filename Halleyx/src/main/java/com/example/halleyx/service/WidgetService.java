package com.example.halleyx.service;

import com.example.halleyx.model.Widget;
import com.example.halleyx.repository.WidgetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WidgetService {

    private final WidgetRepository repository;

    public WidgetService(WidgetRepository repository) {
        this.repository = repository;
    }

    public Widget save(Widget widget) {
        return repository.save(widget);
    }

    public List<Widget> getAllWidgets() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}