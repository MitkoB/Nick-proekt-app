package com.example.nick.web.controller;

import com.example.nick.model.Disease;
import com.example.nick.service.DiseaseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/disease")
public class DiseaseController {
    private final DiseaseService diseaseService;

    public DiseaseController(DiseaseService diseaseService) {
        this.diseaseService = diseaseService;
    }
    @GetMapping("/{id}")
    public String getDiseasePage(@PathVariable Long id, Model model)
    {
        Disease disease=diseaseService.findDiseaseById(id).get();
        model.addAttribute("disease",disease);
        model.addAttribute("bodyContent","disease");
        return "master-template";
    }
}
