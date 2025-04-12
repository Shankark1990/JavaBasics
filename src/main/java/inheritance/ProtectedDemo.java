package inheritance;

class Parent{
    protected void showProperty(){
        System.out.println("10 millionsg");
    }
}
class Child extends Parent{
    void show(){
        showProperty();
    }
}
public class ProtectedDemo {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.show();
    }
}
