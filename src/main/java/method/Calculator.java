package method;

public class Calculator {
    public static void main(String[] args) {

        int addition = Calculator.add(10, 20);
        System.out.println("Addition is: " + addition);

        int substract = Calculator.sub(10, 20);
        System.out.println("Substraction is: " + substract);

        int multiplication = Calculator.mult(10, 20);
        System.out.println("Multiplication is: " + multiplication);

        float division = Calculator.div(10, 20);
        System.out.println("Division is: " + division);



        long pid=ProcessHandle.current().pid();
        System.out.println(pid);

    }

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    static int add(int num1, int num2) {
        return (num1 + num2);
    }

    static int sub(int num1, int num2) {
        return (num1 - num2);
    }

    static int mult(int num1, int num2) {
        return (num1 * num2);
    }

    static float div(float num1, float num2) {
        return (num1 / num2);
    }
}
