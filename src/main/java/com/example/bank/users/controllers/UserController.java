package com.example.bank.users.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/users/me")
    public String getMyUser() {
        return "My user";
    }
}
