package TechPrograms;

import java.util.Set;
import java.util.TreeSet;

public class SetDuplicate {
    public static void main(String[] args) {
        Set<Object> st=new TreeSet<>();

        st.add(new A());
        st.add(new A());
        st.add(new A());

        System.out.println(st.size());

    }
}

class A{
    public void show(){
        System.out.println("A");
    }

}
