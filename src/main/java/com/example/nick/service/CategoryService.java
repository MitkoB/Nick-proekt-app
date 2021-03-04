package com.example.nick.service;

import ch.qos.logback.core.util.DefaultInvocationGate;
import com.example.nick.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> findAllCategories();
    Category create(String name,String description, String firstImage, String secondImage);
    Category findCategoryById(Long id);
    Optional<Category> findCategoryByName(String name);
}
