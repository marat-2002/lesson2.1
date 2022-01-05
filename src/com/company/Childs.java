package com.company;

public final class Childs extends Monkey  {
    private int weigth;

    public int getWeigth() {
        return weigth;
    }

    public Childs(int age, enumColor color,  String name, String kinds, int weigth) {
        super(age, color, name, kinds);
        this.weigth = weigth;

    }

    @Override
    public String toString() {
        return "Возраст: " + getAge() +
                "\nЦвет: " + getColor() +
                "\nИмя: " + getName() +
                "\nВид: " + getKinds() +
                "\nВес: " + getWeigth();

    }
}
