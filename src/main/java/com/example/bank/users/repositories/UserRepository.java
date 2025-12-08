package com.example.bank.users.repositories;

import com.example.bank.users.dto.CreateUserDto;
import com.example.bank.users.models.User;

public class UserRepository {
    public User createUser(CreateUserDto source) {
        var user = new User();

        user.setName(source.name());

        return user;
    }
}
