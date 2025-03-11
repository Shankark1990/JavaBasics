package loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KaprekarConstant {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int number = new Scanner(System.in).nextInt();
        int revNum;
        int diff=number;

        ArrayList<Integer> al=new ArrayList<>();

        System.out.println(reverse(number));

        int count = 0;

        while (diff != 6174) {

            revNum=reverse(number);
            System.out.println(al.toString());

            if(revNum==6174){
                break;
            }

            if(number>revNum){
                diff=number-revNum;
            }else if (revNum>number){
                diff=revNum-number;
            }
//            else {
//                System.out.println("Can't validate..");
//            }

            count++;
            number=diff;
        }

        System.out.println(count);

    }

    public static int reverse(int n) {

        int revNum = 0;
        while (n > 0) {
//            n=n%10;
            revNum = revNum * 10 + n % 10;
            n = n / 10;
        }
        return revNum;
    }
}

