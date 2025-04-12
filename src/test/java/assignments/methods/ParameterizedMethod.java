package assignments.methods;

import com.beust.jcommander.IParameterizedParser;

public class ParameterizedMethod {
    public static void main(String[] args) {

        ParameterizedMethod pm=new ParameterizedMethod();
        pm.add(10,20);

    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
}
