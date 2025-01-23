package TechPrograms;

import java.util.Scanner;

public class SquarCubeForthPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        System.out.println("Square of " + num + " is: " + (num * num));
        System.out.println("Cube of " + num + " is: " + (num * num * num));
        System.out.println("Fourth Power of " + num + " is: " + Math.pow(num, 4));

    }
}
