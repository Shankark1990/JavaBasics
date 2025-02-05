package TechPrograms;

import java.util.Scanner;

public class FindFirst20PrimeNumber {
    public static void main(String[] args) {

        boolean isPrime;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        int count = 0;
        int num = 2;

        while (count != N) {
            isPrime = true;
            for (int i = 2; i <= count; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            num++;

            if (isPrime) {
                System.out.println(num + " is prime number");
                count++;
            }

        }

    }
}
