package loops;

import java.util.Scanner;

public class PrintWeekdayUsingNumber {
    public static void main(String[] args) {
        int weekNumber;
        String weekDay;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number between 1-7: ");
        weekNumber=sc.nextInt();

        switch (weekNumber){
            case 1:
                weekDay="Sunday";
                break;
            case 2:
                weekDay="Monday";
                break;
            case 3:
                weekDay="Tuesday";
                break;
            case 4:
                weekDay="Wednesday";
                break;
            case 5:
                weekDay="Thursday";
                break;
            case 6:
                weekDay="Friday";
                break;
            case 7:
                weekDay="Saturday";
                break;
            default:
                weekDay="";
                System.out.println("Entered invalid number");

        }
        System.out.println("Weekday of number "+weekNumber+" is: "+weekDay );

    }
}
