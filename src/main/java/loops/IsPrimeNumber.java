package loops;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        boolean isPrimeNumber = true;


        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        if (isPrimeNumber) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }
}
