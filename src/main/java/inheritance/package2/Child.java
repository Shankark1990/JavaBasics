package inheritance.package2;

import inheritance.package1.Parent;

public class Child extends Parent {
    void show(){
        showProperty();
    }

    public static void main(String[] args) {
        Child c1=new Child();
        c1.show();
    }
}
