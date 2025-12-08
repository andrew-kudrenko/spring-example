package com.example.bank.users.services;

import com.example.bank.users.models.User;

import java.util.Optional;

public class UserService {
    public Optional<User> findById(int id) {
        var user = new User();

        user.setId(id);
        user.setName("Username");

        return Optional.of(user);
    }
}
