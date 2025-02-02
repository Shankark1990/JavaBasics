package loops;

public class InfiniteLoop {
    public static void main(String[] args) {
        boolean infinite=true;
        // ******* 1st way *******
        while (infinite){
            System.out.println("Infinite...");
        }

        // ******* 2nd way *******
        do {
            System.out.println("Do.. while");

        }while (infinite);

        // ******* 3rd way  *******

        for(int i=0; i<3;i--){
            System.out.println("Infinite in for loop...");
        }

        // ******* 4th way *******
        for(;;){
            System.out.println("Infinite in for loop without any condition..");
        }


    }
}
