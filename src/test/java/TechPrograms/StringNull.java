package TechPrograms;

public class StringNull {
    public static void main(String[] args) {

        try {
            String s1 = null;
            System.out.println(s1.toUpperCase());
        }catch (Exception e)
        {
            System.out.println("Block A");
        }/*catch (NullPointerException e1){
            System.out.println("Block B");
        }*/
    }
}