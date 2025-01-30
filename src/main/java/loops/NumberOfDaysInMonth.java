package loops;

import java.util.Scanner;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        int daysInMonth = 0;
        String monthName;
        int year;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name of month: ");
        monthName = sc.next();

        System.out.print("Enter a year: ");
        year = sc.nextInt();

        //        System.out.println(monthName);

        switch (monthName) {
            case "January":
            case "Jan":
                daysInMonth = 31;
                break;
            case "February":
            case "Feb":
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case "March":
            case "Mar":
                daysInMonth = 31;
                break;
            case "April":
            case "Apr":
                daysInMonth = 30;
                break;
            case "May":
                daysInMonth = 31;
                break;
            case "June":
            case "Jun":
                daysInMonth = 30;
                break;
            case "July":
            case "Jul":
                daysInMonth = 31;
                break;
            case "August":
            case "Aug":
                daysInMonth = 31;
                break;
            case "September":
            case "Sep":
                daysInMonth = 30;
                break;
            case "October":
            case "Oct":
                daysInMonth = 31;
                break;
            case "November":
            case "Nov":
                daysInMonth = 30;
                break;
            case "December":
            case "Dec":
                daysInMonth = 31;
                break;
            default:
                System.out.println("Invalid month name");
        }
        System.out.println("Days in " + monthName + " month are " + daysInMonth);


    }
}
