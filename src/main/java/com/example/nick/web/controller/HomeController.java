package com.example.nick.web.controller;

import com.example.nick.service.DiseaseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final DiseaseService diseaseService;

    public HomeController(DiseaseService diseaseService) {
        this.diseaseService = diseaseService;
    }

    @GetMapping(value = {"/","/home"})
    public String getHomePage(Model model)
    {
        model.addAttribute("bodyContent", "home");
        return "master-template";
    }
    @GetMapping("/help")
    public String getHelpPage(Model model)
    {
        model.addAttribute("bodyContent", "help");
        return "master-template";
    }
    @GetMapping("/conditions")
    public String getConditionsPage(Model model)
    {
        model.addAttribute("diseases",diseaseService.findAll());
        model.addAttribute("bodyContent", "conditions");
        return "master-template";
    }
    @GetMapping("/congrats")
    public String getCongratsPage(Model model)
    {
        model.addAttribute("bodyContent", "congrats");
        return "master-template";
    }
}
