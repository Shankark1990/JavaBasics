package inheritance;

import loops.FactorNumber;

public class InheritanceDemo {
    public static void main(String[] args) {
        M3 m3 = new M3();
        FactorNumber fn = new FactorNumber();
        fn.test();
        int i = 2 ^ 2 ^ 3;
        System.out.println(i);
        System.out.println(3 * 0.1 == 0.3);
        int x = 10;
        int y = 20;
        int z = x++ + y;
        System.out.println(z);
        System.out.println(7 % 4 / 2 * 2);

    }
}

class M1 {
    M1() {
    }

    private M1(int i) {
        System.out.println("M1");
    }
}

class M2 extends M1 {
    M2() {
        System.out.println("M2");
    }
}

class M3 extends M2 {
    M3() {
        System.out.println("M3");
    }
}
