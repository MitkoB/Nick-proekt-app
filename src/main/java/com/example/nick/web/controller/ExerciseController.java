package com.example.nick.web.controller;

import com.example.nick.model.Category;
import com.example.nick.model.Exercise;
import com.example.nick.service.CategoryService;
import com.example.nick.service.ExerciseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ExerciseController {
    private final ExerciseService exerciseService;
    private final CategoryService categoryService;

    public ExerciseController(ExerciseService exerciseService,CategoryService categoryService) {
        this.exerciseService = exerciseService;
        this.categoryService=categoryService;
    }

    @GetMapping("/categories")
    public String getCategories(Model model)
    {
        List<Category> allCategories=categoryService.findAllCategories();
        model.addAttribute("categories",allCategories);
        model.addAttribute("bodyContent", "categories");
        return "master-template";
    }
    @GetMapping("/exercises/{id}")
    public String getExercises(Model model,@PathVariable Long id)
    {
        List<Exercise> exercisesByCategory=exerciseService.findExercisesByCategory(id);
        model.addAttribute("exercises",exercisesByCategory);
        model.addAttribute("bodyContent","exercises");
        return "master-template";
    }
    @PostMapping("/exercises")
    public String getExercisesBySearch(Model model,@RequestParam String search1)
    {
        List<Exercise> exercisesByCategory=exerciseService.findExercisesByCategory(Integer.parseInt(search1));
        model.addAttribute("exercises",exercisesByCategory);
        model.addAttribute("bodyContent","exercises");
        return "master-template";
    }

}
