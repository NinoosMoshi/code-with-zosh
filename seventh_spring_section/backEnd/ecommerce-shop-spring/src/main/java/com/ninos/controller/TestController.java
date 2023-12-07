package com.ninos.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/forAdmin")
    public String forAdmin(){
        return "this is admin";
    }



    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping("/forUser")
    public String forUser(){
        return "this is user";
    }




}
