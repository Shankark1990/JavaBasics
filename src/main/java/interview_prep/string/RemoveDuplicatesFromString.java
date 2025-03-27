package interview_prep.string;

import java.util.Scanner;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");

        String str=sc.next();

        char charArray[]=str.toCharArray();

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){

                if(charArray[i]==charArray[j]){
                    break;
                }

            }

        }
    }
}
