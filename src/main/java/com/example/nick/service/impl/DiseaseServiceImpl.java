package com.example.nick.service.impl;

import com.example.nick.model.Disease;
import com.example.nick.repository.DiseaseRepository;
import com.example.nick.service.DiseaseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiseaseServiceImpl implements DiseaseService {
    private final DiseaseRepository diseaseRepository;

    public DiseaseServiceImpl(DiseaseRepository diseaseRepository) {
        this.diseaseRepository = diseaseRepository;
    }

    @Override
    public Optional<Disease> findDiseaseById(Long id) {
        return diseaseRepository.findById(id);
    }

    @Override
    public List<Disease> findAll() {
        return diseaseRepository.findAll();
    }

    @Override
    public Disease create(String name, String description, String image) {
        Disease disease=new Disease(name,description,image);
        return diseaseRepository.save(disease);
    }
}
