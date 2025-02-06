package loops;

import java.util.Scanner;

public class SumOfNumber {

    public static void main(String[] args) {
        int remainder;
        int result = 0;
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        while (number > 0) {
            remainder = number % 10;
            result += remainder;
            number = number / 10;
        }

        System.out.println("Sum of digits is : " + result);
    }
}
