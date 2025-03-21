package interview_programs;

import java.io.File;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int number = new Scanner(System.in).nextInt();
        int rev = 0, remaidar = 0;
        System.out.println("Input: " + number);
        /*for (;  number!=0; number=number/10) {
            remaidar = number % 10;
            rev = rev * 10 + remaidar;
        }*/

        while (number > 0) {
            remaidar = number % 10;
            rev = rev * 10 + remaidar;
            number = number / 10;
        }

        System.out.println("Output: " + rev);
    }
}
