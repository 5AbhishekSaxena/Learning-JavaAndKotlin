package tech.developingdeveloper.java.GeeksForGeeks.Inheritance;

import java.util.ArrayList;

import tech.developingdeveloper.java.Utils;

/**
 * @author Abhishek Saxena
 * @since 14/08/19 3:15 PM
 */

class Base {
    public void Print() {
        Utils.println("Base");
    }

    public void foo() {
        Utils.println("Base");
    }
}

class Derived extends Base {

    @Override
    public void Print() {
        Utils.println("Derived");
    }

    public void foo() {
        //super.foo();
        Utils.println("Derived foo()");
    }
}

/**
 * Output - Base Derived Derived
 */

public class BasicsIII {

    private static void DoPrint(Base o) {
        o.Print();
    }

    public static void main(String[] args) {
        Base x = new Base();
        Base y = new Derived();
        Derived z = new Derived();
        DoPrint(x);
        DoPrint(y);
        DoPrint(z);

        ArrayList<String> arrayList = new ArrayList<>();
    }

}
