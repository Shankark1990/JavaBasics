package operators;

public class SumOfTwoDigitWithoutAdditionOperator {

    public static void main(String[] args) {
        int num = 75;


        int quotient = num / 10; //7
        int rem = num % 10;  // 5

        int sumofdigits = quotient + rem;

        System.out.println("Sum of " + num + " is: " + sumofdigits);

        int num1=123;
        int sum=0;

        sum=sum+num1/10;
        sum=sum+num%10;

        sum=sum+num1/10;
        sum=sum+num%10;

        sum=sum+num1/10;
        sum=sum+num%10;

        System.out.println(sum);




    }
}
