package TechPrograms;

import java.util.Scanner;

public class ReturnCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        int purchase = sc.nextInt();
        System.out.print("Enter Given amount: ");
        int givenCash = sc.nextInt();
        int returnMoneyAmt = givenCash - purchase;
        System.out.println("Total return amount: " + returnMoneyAmt);

        returnMoneyInCoin(returnMoneyAmt);

    }

    private static void returnMoneyInCoin(int returnMoneyAmt) {

        int tenRupeesCoins;
        int twentyRupeesCoins;
        int twoRupeesCoins;
        int oneRupeesCoins = 0;


        if (returnMoneyAmt <= 9) {
            twoRupeesCoins = returnMoneyAmt / 2;
            oneRupeesCoins = returnMoneyAmt % 2;

            System.out.println("Two rupees coin: " + twoRupeesCoins
                    + "\n" + "One repee coin: " + oneRupeesCoins);

        } else if (returnMoneyAmt >= 10 && returnMoneyAmt <= 19) {
            tenRupeesCoins = returnMoneyAmt / 10;
            int rem = returnMoneyAmt % 10;
            twoRupeesCoins = rem / 2;

            System.out.println("Ten rupees coin: " + tenRupeesCoins
                    + "\nTwo rupees coin: " + twoRupeesCoins
                    + "\nOne repees coin: " + oneRupeesCoins);
        } else if (returnMoneyAmt >= 20) {
            twentyRupeesCoins = returnMoneyAmt / 20;
            int rem = returnMoneyAmt % 10;
            twoRupeesCoins = rem / 2;
            oneRupeesCoins = returnMoneyAmt % 2;

            System.out.println("Twenty rupees coin: " + twentyRupeesCoins
                    + "\nTwo rupees coin: " + twoRupeesCoins
                    + "\nOne repee coin: " + oneRupeesCoins);

        }


/*
        if (returnMoneyAmt % 2 == 0) {
            twoRupeesCoins = returnMoneyAmt / 2;
        } else {
            twoRupeesCoins = returnMoneyAmt / 2;
            oneRupeesCoins = 1;
        }

        System.out.println("Return money in coins: " + twoRupeesCoins + " " + oneRupeesCoins);
*/
    }
}
