package org.gruzdov.spring.models;

import lombok.Data;

@Data
public class Person {
    public Person() {}

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;
}
