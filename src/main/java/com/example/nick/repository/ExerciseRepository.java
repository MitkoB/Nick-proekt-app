package com.example.nick.repository;

import com.example.nick.model.Category;
import com.example.nick.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise,Long> {
    Optional<Exercise> findByName(String name);
    List<Exercise> findAllByCategory(Category category);

}
