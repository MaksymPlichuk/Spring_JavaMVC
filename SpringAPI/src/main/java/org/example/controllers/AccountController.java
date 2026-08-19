package org.example.controllers;

import org.example.entities.UserEntity;
import org.example.services.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {
    private final UserInfoService userInfoService;

    @GetMapping("/login")
    public String login(){
        return "account/login";
    }

    @GetMapping("/register")
    public String register() {
        return "account/register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute UserEntity user){
        userInfoService.registerUser(user);
        return "redirect:/login";
    }
}
