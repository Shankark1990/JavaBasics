package loops;

public class PrintTable {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            if(i==12 || i==6 || i==17){
                continue;
            }else {
                System.out.println("======Table for "+i+"======");
                for(int j=1;j<=10;j++){
                    System.out.println(i + " * "+ j+ "= "+i*j);
                }
            }
        }
    }
}
