package TechPrograms;

public class ProgramId82 {
    public static void main(String[] args) {

        int i = 10;
        int j = 7;

        double db1 = i / j;
        double db2 = (double) i / j;
        double db3 = i / (double) j;

        System.out.println(db1);
        System.out.println(db2);
        System.out.println(db3);

        int x = 10;
        int y = 0;

        if (x > y)
            System.out.print("Hello");
        else
            System.out.print("Welcome");

        System.out.print("Log" + x + ":" + y);

        int xy=x++ + ++x;

        System.out.println(xy);


    }
}
