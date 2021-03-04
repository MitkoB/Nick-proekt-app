package com.example.nick.service;

import com.example.nick.model.Disease;

import java.util.List;
import java.util.Optional;

public interface DiseaseService {
    Optional<Disease> findDiseaseById(Long id);
    List<Disease> findAll();
    Disease create(String name,String description,String image);
}
