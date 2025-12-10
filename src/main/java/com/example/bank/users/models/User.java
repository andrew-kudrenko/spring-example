package com.example.bank.users.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String email;

    @Column
    private String firstName;

    @Column
    private String middleName;

    @Column
    private String lastName;

    @Column
    private Date createdAt;

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
