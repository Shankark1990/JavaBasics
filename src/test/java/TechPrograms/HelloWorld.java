package TechPrograms;

import datatypes.ShortTypeDemo;

public class HelloWorld {
    public static void main(String[] args) {
//        ShortTypeDemo std=new ShortTypeDemo();  Here we can access class from main folder but can't access class from test folder to main folder.
        int x = 1;
        int y = 0;

        if (x > y) {
            System.out.print("Hello");
        } else {
            System.out.print("Welcome");
        }
        System.out.print("Log" + x + ":" + y);
    }
}