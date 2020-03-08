package io.zipcoder.interfaces;

public class Person {
    final long id;
    private String name;


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, long id) {
        this.name = name;
        this.id = id;
    }
}
