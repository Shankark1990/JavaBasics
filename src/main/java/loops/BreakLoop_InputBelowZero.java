package loops;

import java.util.Scanner;

public class BreakLoop_InputBelowZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value: ");

        int num=sc.nextInt();

        while (true){
            System.out.println("loop");
            if(num<0)
                break;
        }
    }
}
