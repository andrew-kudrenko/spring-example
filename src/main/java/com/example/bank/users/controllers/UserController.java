package com.example.bank.users.controllers;

import com.example.bank.users.models.User;
import com.example.bank.users.repositories.UserRepository;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/api/users/me")
    public User getMyUser() throws BadRequestException {
        var result = userRepository.findOneById(1);

        if (result.isEmpty()) {
            throw new BadRequestException("Такого пользователя нет.");
        }

        return result.get();
    }
}
