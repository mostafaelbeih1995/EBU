package com.stc.ebu.ebuauth.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/ebu-auth")
public class AuthController {


    @GetMapping
    public String test(){
        return "EBU authentication";
    }

    @GetMapping("/test")
    public String test1(){
        return "test";
    }

}
