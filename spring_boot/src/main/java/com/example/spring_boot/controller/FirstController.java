package com.example.spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
     @GetMapping("/")
     public String first() {
         return "firstView";
     }
}