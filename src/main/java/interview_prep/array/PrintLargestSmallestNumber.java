package interview_prep.array;

import java.util.List;

public class PrintLargestSmallestNumber {
    public static void main(String[] args) {
        int arr[] = {99, 4, 6, 3, 2, 8, 66, 54};

        System.out.println(Integer.MAX_VALUE);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest number: " + min);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest number : " + max);


    }
}
