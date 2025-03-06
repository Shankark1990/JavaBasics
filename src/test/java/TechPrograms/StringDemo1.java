package TechPrograms;

public class StringDemo1 {
    public static void main(String[] args) {

        String s="Java";
        s=s+" Programming";
        System.out.println(s);

        s=s.substring(10);

        System.out.println(s);

        String s1=new String("Hello");
        s1=s+s1;
        System.out.println(s1);
    }
}
