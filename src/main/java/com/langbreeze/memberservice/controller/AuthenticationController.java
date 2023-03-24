package com.langbreeze.memberservice.controller;

import com.langbreeze.memberservice.model.AuthenticationRequest;
import com.langbreeze.memberservice.model.AuthenticationResponse;
import com.langbreeze.memberservice.model.RegisterRequest;
import com.langbreeze.memberservice.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/memberservice/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ){
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/logon")
    public ResponseEntity<AuthenticationResponse> submitLogin(
            @RequestBody AuthenticationRequest request
    ){
        return ResponseEntity.ok(service.authenticate(request));
    }
}
