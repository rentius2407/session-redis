package com.tut;

import java.io.Serializable;

public class WelcomeModel implements Serializable {

    private String name;

    public WelcomeModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEmpty() {
        return this.name == null || this.name.isBlank();
    }
}
