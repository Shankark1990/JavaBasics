package loops;

import java.util.Scanner;

public class ArmstrongNumber {

    // count the number of digits to use for power.
    public int power(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {

        int remainder;
        int result = 0;
        int number;
        int originalNumber;

        ArmstrongNumber as=new ArmstrongNumber();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        originalNumber = sc.nextInt();

        number = originalNumber;

        int pow = as.power(number);

        while (number != 0) {
            remainder = number % 10;
            result = result + (int) Math.pow(remainder, pow);
            number = number / 10;
        }

        System.out.println(result);

        if (originalNumber == result)
            System.out.println(originalNumber + " is an Armstrong number");
        else
            System.out.println(originalNumber + " is not an Armstrong number");

    }

}
