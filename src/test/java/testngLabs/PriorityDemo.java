package testngLabs;

import org.testng.annotations.Test;

public class PriorityDemo {

    //By default all test's priority is zero

    @Test(priority = 10)
    public void c(){}

    @Test
    public void b(){}

    @Test(priority = 7)
    public void a(){}

    @Test(priority = -3)
    public void d(){}

}
