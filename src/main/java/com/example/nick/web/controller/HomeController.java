package com.example.nick.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

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
    @GetMapping("/congrats")
    public String getCongratsPage(Model model)
    {
        model.addAttribute("bodyContent", "congrats");
        return "master-template";
    }
}
