package assignments.methods;

class A{
    public int add(int i, int j){
        return i+j;
    }
}
public class Method_Call_with_Argument {
    public static void main(String[] args) {

        A a1=new A();
        System.out.println(a1.add(a1.add(10,20),a1.add(30,40)));

    }
}
