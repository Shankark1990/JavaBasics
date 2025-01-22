package TechPrograms;

import java.util.Scanner;

public class MinutesToDaysAndYear {
    public static void main(String[] args) {
        int min=60;
        int day=24;
        int year=365;
        int minutesInDay=1440;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of minutes: ");
        int inputMins=sc.nextInt();

        try {
            int findYears=inputMins/(min*day*year);
            int findDays= inputMins/minutesInDay;

            System.out.println(findYears);
            System.out.println(findDays);

        }catch (Exception e){
            System.out.println("Invalid output: "+e);
        }


    }
}
