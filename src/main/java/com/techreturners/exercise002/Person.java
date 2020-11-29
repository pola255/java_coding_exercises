package com.techreturners.exercise002;


public class Person {
    private String name;
    private String lastName;
    private String city;
    private Integer age;

    public Person(String name, String lastName, String city, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
    }

    public String getPersonName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }
    public Integer getAge() {
        return age;
    }

    
}
