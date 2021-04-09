package com.example.app.olsoos;

import java.io.Serializable;

public class Person implements Serializable {

    // we should have to add Serializable if we want to save Object with ObjectOutputStream

    public String name;
    public String surname;
    public int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
