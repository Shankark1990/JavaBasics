package operators;

public class UnsignedRighShiftOperator {
    public static void main(String[] args) {
        int i = 12;

        int a2 = i >> 1;
        int a30 = i >>> 30;
        int a32 = i >>> 32;

        System.out.println("i >> 2: " + a2);
        System.out.println("i >>> 30: " + a30);
        System.out.println("i >>> 32: " + a32);


    }
}
