package operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 10;
        int j = i++ + i++ + --i + ++i + ++i;
         //     10    11     11   12    13

        System.out.println(i);
        System.out.println(j);
    }
}
