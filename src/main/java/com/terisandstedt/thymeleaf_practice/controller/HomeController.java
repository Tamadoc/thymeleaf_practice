package com.terisandstedt.thymeleaf_practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showHome(Model model) {
        model.addAttribute("dateTime", LocalDateTime.now());

        return "index";
    }
}
