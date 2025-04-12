package assignments.methods;

public class NonParameterizedMethod {

    
    public void test(){
        System.out.println("Non-static, non parameterized method");
    }

    public static void test1(){
        System.out.println("Static method, non parameterized");
    }

    public static void main(String[] args) {
        NonParameterizedMethod np=new NonParameterizedMethod();
        np.test();
        test1();
    }
}
