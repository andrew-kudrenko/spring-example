package com.example.bank.currencies.models;

import jakarta.persistence.*;

@Entity
@Table(name="currencies")
public class Currency {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String title;

    @Column
    private String letterCode;

    @Column
    private int numericCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLetterCode() {
        return letterCode;
    }

    public void setLetterCode(String letterCode) {
        this.letterCode = letterCode;
    }

    public int getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(int numericCode) {
        this.numericCode = numericCode;
    }
}
