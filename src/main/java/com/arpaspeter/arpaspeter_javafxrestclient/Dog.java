package com.arpaspeter.arpaspeter_javafxrestclient;

public class Dog {
    private int id;
    private String name;
    private String breed;
    private int age;
    private boolean rabiesVax;


    public Dog(int id, String name, String breed, int age, boolean rabiesVax) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.rabiesVax = rabiesVax;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public boolean isRabiesVax() {
        return rabiesVax;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRabiesVax(boolean rabiesVax) {
        this.rabiesVax = rabiesVax;
    }
}
