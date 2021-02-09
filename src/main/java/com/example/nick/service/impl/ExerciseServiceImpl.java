package com.example.nick.service.impl;

import com.example.nick.model.Category;
import com.example.nick.model.Exercise;
import com.example.nick.repository.CategoryRepository;
import com.example.nick.repository.ExerciseRepository;
import com.example.nick.service.ExerciseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseServiceImpl implements ExerciseService {
    private final ExerciseRepository exerciseRepository;
    private final CategoryRepository categoryRepository;

    public ExerciseServiceImpl(ExerciseRepository exerciseRepository, CategoryRepository categoryRepository) {
        this.exerciseRepository = exerciseRepository;
        this.categoryRepository=categoryRepository;
    }

    @Override
    public Exercise create(String name, String description, Long categoryId, String imageFirst, String imageSecond, String repeat) {
        Category category=categoryRepository.findById(categoryId).get();
        Exercise exercise=new Exercise(name,description,category,imageFirst,imageSecond,repeat);
        return exerciseRepository.save(exercise);
    }

    @Override
    public List<Exercise> findAllExercises() {
        return exerciseRepository.findAll();
    }

    @Override
    public Optional<Exercise> findExerciseByName(String name) {
        return exerciseRepository.findByName(name);
    }

    @Override
    public List<Exercise> findExercisesByCategory(long categoryId) {
        Category category=categoryRepository.findById(categoryId).get();
        return exerciseRepository.findAllByCategory(category);
    }

}
