package loops;

import java.util.Scanner;

public class BreakLoop_InputBelowZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int num;

        while (true){

            System.out.println("loop");
            System.out.print("Enter a value: ");
            num=sc.nextInt();
            if(num<0)
                break;
        }
        System.out.println("execution stopped...");
    }
}
