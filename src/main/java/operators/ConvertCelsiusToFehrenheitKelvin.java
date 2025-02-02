package operators;

import java.util.Scanner;

public class ConvertCelsiusToFehrenheitKelvin {
    public static void main(String[] args) {
        double celsius;
        double Feh;
        double kelvin;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a celsius: ");
        celsius = sc.nextDouble();

        Feh = (celsius * 1.8) + 32;

        System.out.println(celsius + " celsius converted to Fehrenheit is: " + Feh);

        kelvin = celsius + 273.15;

        System.out.println(celsius + " celsius converted to kelvin is: " + kelvin);


    }
}
