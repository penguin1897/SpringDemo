package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String hello(Model model){
        model.addAttribute("message", "Hello Tymeleaf!!");
        return "hello";
    }

    @GetMapping("/index")
    public String index(Model model){
        return "index";
    }
}
