package com.example.halleyx.repository;

import com.example.halleyx.model.Widget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WidgetRepository extends JpaRepository<Widget, Long> {
}