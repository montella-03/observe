package com.chris.observe.controller;

import io.micrometer.observation.annotation.Observed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("")
    @Observed(name = "home", contextualName = "home")
    public String home() {
        return "Hello, world!";
    }
}
