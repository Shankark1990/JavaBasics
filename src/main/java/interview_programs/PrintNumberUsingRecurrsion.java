package interview_programs;

public class PrintNumberUsingRecurrsion {
    public static void main(String[] args) {
        int n=10;
        PrintNumberUsingRecurrsion p=new PrintNumberUsingRecurrsion();
        p.printNumber(n);
    }
    public void printNumber(int n){
        if(n<1)
            return;
        printNumber(n-1);
        System.out.println(n);
    }
}
