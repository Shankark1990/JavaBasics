package assignments.methods;

public class MethodCreation {

    /*This is non-static method*/
    public int show(int a, int b) {
        System.out.println("This is non-static method");
        return 0;

    }

    /*This is static method*/
    public static void demo() {
        System.out.println("static method");
    }

    public static void main(String[] args) {
        MethodCreation m1 = new MethodCreation();
        m1.show(12,20);
        demo();

    }
}
