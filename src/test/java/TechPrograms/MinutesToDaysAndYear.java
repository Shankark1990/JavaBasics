package TechPrograms;

import java.util.Scanner;

public class MinutesToDaysAndYear {
    public static void main(String[] args) {
        int min = 60;
        int day = 24;
        int year = 365;
        int minutesInDay = 1440;
        int inputMins=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of minutes: ");



        try {
            inputMins=Integer.parseInt(sc.next());
            int findYears = inputMins / (min * day * year);
            int findDays = inputMins / minutesInDay;

            System.out.println("Years are: " + findYears);
            System.out.println("Days are: " + findDays);

        } catch (NumberFormatException e) {

            System.out.println("Invalid input");

        }
    }
}
