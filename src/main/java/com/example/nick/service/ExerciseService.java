package com.example.nick.service;

import com.example.nick.model.Exercise;

import java.util.List;
import java.util.Optional;

public interface ExerciseService {
    Exercise create(String name,String description, Long categoryId, String imageFirst,String imageSecond, String repeat);
    List<Exercise> findAllExercises();
    Optional<Exercise> findExerciseByName (String name);
    List<Exercise> findExercisesByCategory(long categoryId);
}
