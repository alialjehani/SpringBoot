package com.example.SpringBoot.controllers.model;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private LocalDate date;

    public Person(String name, int age, LocalDate date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
