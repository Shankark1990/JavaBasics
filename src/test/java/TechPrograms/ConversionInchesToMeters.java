package TechPrograms;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ConversionInchesToMeters {
    public static void main(String[] args) {
        double inch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter inch value: ");

        inch=sc.nextInt();

        double meter;
        meter=inch*0.0254;

//        if(inch !=)
        System.out.println("Conversion of inch "+inch+" is to meter is "+meter);
    }
}
