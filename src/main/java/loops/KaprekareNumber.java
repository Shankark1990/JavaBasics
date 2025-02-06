package loops;

import java.util.ArrayList;

public class KaprekareNumber {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;

        ArrayList<Integer> kaprekarNumber = findKaprekarNumber(start, end);

        for (int number : kaprekarNumber) {
            System.out.println(number);
        }

        int findKap=1459;
        boolean isKap=isKaprekar(findKap);
        if(isKap)
            System.out.println(findKap+" is a Kaprekar number");
        else
            System.out.println(findKap+" is a not Kaprekar number");
    }

    public static ArrayList<Integer> findKaprekarNumber(int start, int end) {
        ArrayList<Integer> kapreKarnumbers = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (isKaprekar(i)) {
                kapreKarnumbers.add(i);
            }

        }
        return kapreKarnumbers;
    }

    public static boolean isKaprekar(int num) {
        int squared = num * num;

        String squaredStr = String.valueOf(squared);

        for (int i = 1; i < squaredStr.length(); i++) {

            String firstPart = squaredStr.substring(0, i);
            String secondPart = squaredStr.substring(i);
            int first = (firstPart.isEmpty()) ? 0 : Integer.parseInt(firstPart);
            int second = (secondPart.isEmpty()) ? 0 : Integer.parseInt(secondPart);
            if (first + second == num) {
                return true;
            }

        }
        return false;
    }
}
