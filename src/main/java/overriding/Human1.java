package overriding;

public class Human1 {
    String name;
    int age;

    private Human1(String name, int age){
        this.name=name;
        this.age=age;
    }

    static Human1 getObj(){
        return new Human1("Shankar",30);
    }
}

class HumanDemo{
    public static void main(String[] args) {
        Human1 h= Human1.getObj();
    }
}
