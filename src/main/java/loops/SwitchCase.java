package loops;

public class SwitchCase {
    public static void main(String[] args) {
        String day="MONDAY";

        switch (day){
            case "MONDAY":
                System.out.println("MONDAY");
                break;
            case "MOnday":
                System.out.println("MOnday");
                break;
            case "Monday":
                System.out.println("Monday");
                break;
            default:
                System.out.println("Day not found");
        }
    }
}
