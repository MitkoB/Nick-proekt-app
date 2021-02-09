package com.example.nick.web.controller;

import com.example.nick.exception.InvalidUserCredentialsException;
import com.example.nick.model.User;
import com.example.nick.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/login")
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping
    public String getLoginPage()
    {
        return "login";
    }
    @PostMapping
    public String login(HttpServletRequest request, Model model)
    {
        User user;
        try{
            user=this.loginService.login(request.getParameter("username"),request.getParameter("password"));
            request.getSession().setAttribute("user",user);
            return "redirect:/home";
        }
        catch(InvalidUserCredentialsException exception)
        {
            model.addAttribute("hasErrors",true);
            model.addAttribute("error",exception.getMessage());
            return "login";
        }
    }
}
