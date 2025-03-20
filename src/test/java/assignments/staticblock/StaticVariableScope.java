package assignments.staticblock;


public class StaticVariableScope {
    public static void main(String[] args) {
        System.out.println(A.i);
        A a1=new A();
        System.out.println(a1.i);
    }
}
class A{
    static int i=10;
}