package loops;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        boolean isPrimeNumber = true;

        if (number % 2 == 0) {
            System.out.println(number + " is not a prime number");
            sc.close();
        } else {
            for (int i = 3; i < (number) / 2; i = i + 2) {
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
}
