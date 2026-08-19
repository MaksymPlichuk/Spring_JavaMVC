package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") //Шлях до головної сторінки автоматично шукає файл з таким іменем у templates
    public String index() {
        return "index";
    }

}
