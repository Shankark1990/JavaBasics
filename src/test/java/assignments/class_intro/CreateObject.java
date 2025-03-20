package assignments.class_intro;

public class CreateObject {
    public static void main(String[] args) {
        HumanDemo d1 = new HumanDemo();
        d1.age = 30;
        d1.name = "Shankar";
        d1.humanDetail();
    }
}

class HumanDemo {
    int age;
    String name;

    public void humanDetail() {

        System.out.println(name + " " + age);

    }
}
