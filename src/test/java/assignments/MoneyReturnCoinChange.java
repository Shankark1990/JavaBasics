package assignments;

import java.util.Scanner;

public class MoneyReturnCoinChange {
    public static void main(String[] args) {
        double purchase, tendered, change;
        int toonies, loonies, quarters, dimes, nickels;

        Scanner keyboard=new Scanner(System.in);
        System.out.print("price?");
        purchase=keyboard.nextDouble();
        System.out.println("cash paid?");
        tendered=keyboard.nextDouble();

        change = tendered - purchase;
        toonies = (int) (change / 200.00);
        change = tendered - purchase;
        loonies = (int) (change / 100.00);
        change = change - loonies * 100;
        quarters = (int)(change / 25);
        change = change - quarters * 25;
        dimes = (int)(change / 10);
        change = change - dimes * 10;
        nickels = (int)(change / 5);
        change = change - nickels * 5;


        System.out.println("The amount paid: " + tendered);

        System.out.println("The cost: " + purchase);

        System.out.println("The change: ");

        System.out.println("The number of toonies is: " + toonies);

        System.out.println("The number of loonies is: " + loonies);

        System.out.println("The number of quarters is: " + quarters);

        System.out.println("The number of dimes is: " + dimes);

        System.out.println("The number of nickels is: " + nickels);

    }
}
