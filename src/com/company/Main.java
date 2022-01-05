package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Monkey monkey = new Monkey(8, enumColor.ORANGE, "Цезарь", "Шимпанзе");
        System.out.println(monkey.toString());
        monkey.eatBanan();

        System.out.println("__________________________");

    Childs childs = new Childs(9, enumColor.WHITE,"Пит","Вандеру",78);
        System.out.println(childs.toString());
        childs.eatBanan( 10);

        System.out.println("__________________________");

        Childs childs1 = new Childs(11, enumColor.BROWN,"Гари", "Носач",52);
        System.out.println(childs.toString());
        childs.eatBanan();






    }
}
