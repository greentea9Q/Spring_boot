package com.example.spring_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NumberListController {

    @GetMapping("/numbers")
    public String showNumbers() {
        // データ渡しはせず、ビュー名だけ返す
        return "numberList";
    }
}
