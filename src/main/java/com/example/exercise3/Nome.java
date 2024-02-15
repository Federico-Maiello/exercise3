package com.example.exercise3;

public class Nome {
    String name;

    public Nome(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nome{" +
                "name='" + name + '\'' +
                '}';
    }
}
