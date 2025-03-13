package overriding;

import java.util.Scanner;

class PolymorphismDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a browser: ");

        String browser = sc.next();

        Browser b1 = null;
        if (browser.equals("Chrome")) {
            b1 = new Chrome();

        } else {
            b1 = new Mozilla();
        }

        b1.click();
        b1.sendKeys(browser);


    }
}

public abstract class Browser {
    public abstract void click();

    public abstract void sendKeys(String str);

}

class Chrome extends Browser {

    @Override
    public void click() {
        System.out.println("Chrome - click");
    }

    @Override
    public void sendKeys(String str) {
        System.out.println("Chrome - sendKeys" + str);

    }
}

class Mozilla extends Browser {

    @Override
    public void click() {
        System.out.println("Mozilla - click");
    }

    @Override
    public void sendKeys(String str) {
        System.out.println("Chrome - sendKeys" + str);

    }
}
