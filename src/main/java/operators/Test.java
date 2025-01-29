package operators;

public class Test {

    public static void main(String[] args) {
//        System.out.println((15*4%7));
//        System.out.println((15%4*7));
//        System.out.println((18/3*3%4));
//        System.out.println((18*3/3/4));
//
//        int i=10;
//        int j=i++;
//
//        System.out.println(i);
//        System.out.println(j);

        int a = 10, b = 20, c = 30;
        if (a > b || b > c && a < c)
            System.out.println("True");
        else
            System.out.println("False");

        System.out.println(a < c && b < c);

        if (!false) {

            System.out.println("true..");

        } else
            System.out.println("false..");

        int j = 10 * 4 + 2;
        int k = 10 + 4 * 2;
        int m = 10 + 4 * 2 % 2;
        int g = 10 / 5 * 6 / 2;

        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
        System.out.println(g);


    }
}
