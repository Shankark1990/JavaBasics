package operators;

public class Test {
    public static void main(String[] args) {
        System.out.println((15*4%7));
        System.out.println((15%4*7));
        System.out.println((18/3*3%4));
        System.out.println((18*3/3/4));

        int i=10;
        int j=i++;

        System.out.println(i);
        System.out.println(j);
    }
}
