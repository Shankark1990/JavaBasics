package string;

public class StringCompare {
    public static void main(String[] args) {
        /*String s1 = "abc";
        String s2 = "abc";

        String s3 = new String("abcd");
        String s4 = new String("abcd");

//        System.out.println(s3==s4);

        System.out.println("s1 == s2: " + (s1 == s2) );

        Thread t1=Thread.currentThread();
        System.out.println(t1);*/

        String s1="Java";
        String s2=new String("Java");
        String s3="Java";
        String s4=new String("Java");



        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
        System.out.println(s2==s4);


    }
}
