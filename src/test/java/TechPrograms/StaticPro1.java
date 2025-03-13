package TechPrograms;

public class StaticPro1 {
    static {
        System.out.println("tech");
//        throw new Exception();
    }
    {
        System.out.println("Hello");
    }

    StaticPro1(){
        System.out.println("constructor");
    }

}
class Test{
    public static void main(String[] args) {
        System.out.println("elliptica");
        StaticPro1 st=new StaticPro1();
    }
}
