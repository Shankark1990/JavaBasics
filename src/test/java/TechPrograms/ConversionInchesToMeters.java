package TechPrograms;

import java.util.Scanner;

public class ConversionInchesToMeters {
    public static void main(String[] args) {
//        double inchD;
        int inchInt;
        double meter;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter inch value: ");

        try {
            inchInt = Integer.parseInt(sc.next());
            meter = inchInt * 0.0254;
            System.out.println(inchInt + " is equal to " + meter + " meter");

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format - " + e.getMessage());

        }

    }
}
