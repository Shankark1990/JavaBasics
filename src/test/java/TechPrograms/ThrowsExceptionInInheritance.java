package TechPrograms;

import java.io.IOException;

class Parent{
    void m1() throws IOException{
        System.out.println("Parent");
    }
}

class Child extends Parent{
    void m1() throws ArithmeticException{
        System.out.println("Child");
    }
}
public class ThrowsExceptionInInheritance {
    public static void main(String[] args) {
        Child ch=new Child();
        ch.m1();
    }
}