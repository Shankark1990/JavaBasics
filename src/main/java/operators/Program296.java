package operators;

public class Program296 {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;

        if (x++ > ++y) {
            System.out.print("Hello");
        } else {
            System.out.print("Welcome");
        }

        System.out.println("Log" + x + ":" + y);
    }
}
