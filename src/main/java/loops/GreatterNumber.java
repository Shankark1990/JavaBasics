package loops;

import java.util.Arrays;
import java.util.Scanner;

public class GreatterNumber {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        num3 = sc.nextInt();

        // Using if else
        if (num1 > num2 && num1 > num3) {
            System.out.println("Greatter number is: " + num1 + " amoung " + num1 + " " + num2 + " " + num3);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Greatter number is: " + num2 + " amoung " + num1 + " " + num2 + " " + num3);
        } else {
            System.out.println("Greatter number is: " + num3 + " amoung " + num1 + " " + num2 + " " + num3);
        }

        // Using Ternary operators
        int largestNumber = num3 > (num1 > num2 ? num1 : num2) ? num3 : ((num1 > num2) ? num1 : num2);
        System.out.println("Find the greatest number using ternary operator is: "+largestNumber);

        // Using Math.max() method

        System.out.println("Using Math.max() method largest number is: "+Math.max(Math.max(num1,num2),num3));

    }
}
