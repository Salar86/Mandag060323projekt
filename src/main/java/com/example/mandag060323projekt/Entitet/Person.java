package com.example.mandag060323projekt.Entitet;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    String password;
    String role;
    List<String> list = new ArrayList<>();

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
        this.role = "bruger";
        this.list = new ArrayList<>();
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

    public List<String> getList() {
        return list;
    }
}
