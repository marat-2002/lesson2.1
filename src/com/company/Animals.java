package com.company;

public class Animals {
    private int age;
    private enumColor color;


    public Animals(int age, enumColor color) {
        this.age = age;
        this.color = color;

    }

    public int getAge() {
        return age;
    }

    public enumColor getColor() {
        return color;
    }


    public String toString() {
        return "Возраст: " + getAge() +
                "\nЦвет: " + getColor();


    }
}
