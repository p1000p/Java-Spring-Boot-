package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PhotoController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello World");
        return "index";
    }

    @GetMapping("/addphoto")
    public String addPhoto(Model model) {
        model.addAttribute("message", "Add a Photo");
        return "add";
    }

    @GetMapping("/searchphoto")
    public String searchPhoto(Model model) {
        model.addAttribute("message", "Search for a Photo");
        return "search";
    }
}
