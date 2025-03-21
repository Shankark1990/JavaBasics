package assignments.instance_variable;

public class InstanceVar {
    /*Q - can you reassign instance variable?*/
    int i=10;
   
    public static void main(String[] args) {
    new InstanceVar().test();
    }
    void test(){
        i=20;
        System.out.println(i);
    }
}
