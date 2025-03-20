package assignments.staticblock;

public class StaticBlockDemo {
    static {
        System.out.println("First block");
    }
    static {
        System.out.println("Second block");
    }

    public static void main(String[] args) {
        System.out.println("main block");
    }
}
