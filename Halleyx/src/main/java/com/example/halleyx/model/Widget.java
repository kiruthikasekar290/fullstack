package com.example.halleyx.model;

import jakarta.persistence.*;

@Entity
public class Widget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String type;

    private String description;

    private int width;

    private int height;

    @Column(columnDefinition = "TEXT")
    private String configJson;

    // getters setters
}