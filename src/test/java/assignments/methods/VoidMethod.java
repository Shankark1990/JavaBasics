package assignments.methods;

public class VoidMethod {
    void m1(){
        System.out.println("In void method");
    }
    static void m2(){
        System.out.println("In static void method");
    }

    public static void main(String[] args) {
        VoidMethod v1=new VoidMethod();
        v1.m1();
        m2();
    }
}
