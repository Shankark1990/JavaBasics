package interfaces;

public class InterfaceDemo {

}
interface Rural{
    void showRuralInterest();
}

interface Urban{
    void showUrbanInterest();
}

interface National{
    void showStateInterest();
}

interface International{
    void showInternationalInterest();
}

class SBI implements Rural, Urban, National, International{

    public void showRuralInterest(){

    }
    public void showUrbanInterest(){

    }
    public void showStateInterest(){

    }
    public void showInternationalInterest(){

    }

}