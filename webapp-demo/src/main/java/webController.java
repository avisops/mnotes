package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDateTime;

@Controller
public class WebController {

    @GetMapping("/")
    public String home(Model model) {
        // This is dynamic data generated on the server
        model.addAttribute("serverTime", LocalDateTime.now());
        model.addAttribute("message", "Welcome to your Maven-built Web App!");
        return "index"; // Looks for index.html in templates/
    }
}
