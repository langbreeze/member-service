package com.langbreeze.memberservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/memberservice/v1/home")
public class LogonController {


    @GetMapping
    public ResponseEntity<String> getHomePage(){
        return ResponseEntity.ok("Welcome to the homepage");
    }
}
