package TechPrograms;

public class LogicalAndOR {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if (a > b || b > c && a < c) {
            System.out.println("True");
        } else
            System.out.println("False");
    }
}
