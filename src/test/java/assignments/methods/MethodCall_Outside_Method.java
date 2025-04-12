package assignments.methods;

public class MethodCall_Outside_Method {
    public static int m1(){
        return 10;
    }
    int k=m1();

    public static void main(String[] args) {
        MethodCall_Outside_Method call=new MethodCall_Outside_Method();
        call.m2();

    }
    public void m2(){
        System.out.println(k);
    }
}
