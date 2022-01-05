package com.company;

public class Monkey extends Animals {
    private String name;
    private String kinds;

    public String getName() {
        return name;
    }

    public String getKinds() {
        return kinds;
    }

    public Monkey(int age, enumColor color, String name, String kinds) {
        super(age, color);
        this.name = name;
        this.kinds = kinds;
    }
    public static void eatBanan(){
        System.out.println(" Обезьяна есть банан ");

    }
    public final void eatBanan(int colum ){
        colum = 5;
        System.out.println(" Сколько бананов сьел обезьяна? " + colum);
    }
    public String toString() {
        return "Возраст: " + getAge() +
                "\nЦвет: " + getColor() +
                "\nИмя: " + getName() +
                "\nВид: " + getKinds();


    }
}
