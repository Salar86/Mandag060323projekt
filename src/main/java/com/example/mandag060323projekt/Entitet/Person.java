package com.example.mandag060323projekt.Entitet;

public class Person {
    String name;
    String password;
    String role;

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
        this.role = "bruger";
    }

    public Person(String name, String password, String role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
}
