package com.librarymanagementsystem;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for Serializable classes
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}