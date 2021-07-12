package com.silasdias.comicsapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/comics")
public class ComicsController {

    @GetMapping
    public String getBook() {
        return "API Test!";
    }
}
