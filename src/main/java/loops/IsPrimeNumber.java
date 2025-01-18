package loops;

public class IsPrimeNumber {
    public static void main(String[] args) {
        boolean isPrimeNumber = true;
        int number = 14;

        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        if (isPrimeNumber) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }
}
