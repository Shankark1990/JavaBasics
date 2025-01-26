package TechPrograms;

import java.util.Scanner;

public class SecondToHourMinute {
    public static void main(String[] args) {
        int hour;
        int minute;
        int second;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the seconds: ");
        second = sc.nextInt();

        hour = second / 3600;
        minute = (second % 3600) / 60;
        second = second % 60;

        System.out.println(hour + " hours " + minute + " minutes " + second + " seconds");

    }
}
