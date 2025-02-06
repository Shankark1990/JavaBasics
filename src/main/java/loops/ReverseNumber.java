package loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = sc.nextInt();

        int remainder;
        int reverse = 0;

        // 1st way to reverse a number using operators.
        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        System.out.println("Reversed a number using while loop is: " + reverse);

        // 2nd way to reverse a number using for loop;
        for (; number != 0; number = number / 10) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }

        System.out.println("Reversed a number using for loop is: " + reverse);

    }
}
