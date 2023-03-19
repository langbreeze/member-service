package com.langbreeze.memberservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LogonController {
    @GetMapping({"/logon", "/"})
    public void getLoginPage(){

    }

    @PostMapping("/logon")
    public void submitLogin(){

    }

    @GetMapping("/home")
    public void getHomePage(){

    }
}
