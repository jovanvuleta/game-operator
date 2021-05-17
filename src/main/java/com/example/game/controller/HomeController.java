package com.example.game.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/home")
@Slf4j
@RequiredArgsConstructor
public class HomeController {
    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("homePage", "Greetings home page!");
        return "index";
    }
}
