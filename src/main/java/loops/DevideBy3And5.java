package loops;

public class DevideBy3And5 {
    public static void divideBy3(int i) {
        System.out.println("Divide by 3: ");
        for (int j = 1; j <= 100; j++) {

            if (j % i == 0) {
                System.out.print(j + " ");
            }
        }
    }

    public static void divideby5(int i) {
        System.out.println("\nDivide by 5: ");
        for (int j = 1; j <= 100; j++) {
            if (j % i == 0) {
                System.out.print(j + " ");
            }
        }
    }

    public static void divideBy5And3(int i, int j) {
        System.out.println("\nDivide by 3 and 5: ");
        for (int k = 1; k <= 100; k++) {
            if (k % i == 0 && k % j == 0) {
                System.out.print(k + " ");
            }
        }
    }
    public static void main(String[] args) {
        int three = 3;
        int five = 5;

        divideBy3(3);
        divideby5(5);
        divideBy5And3(3, 5);

    }


}
