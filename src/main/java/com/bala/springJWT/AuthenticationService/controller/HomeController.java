package com.bala.springJWT.AuthenticationService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String homepage(){
        return "Welcome to All";
    }
}
