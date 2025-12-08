package com.example.bank.users.models;

public class User {
    private int id;
    private String name;

    public boolean equals(User user) {
        return user != null && user.getId() == this.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
