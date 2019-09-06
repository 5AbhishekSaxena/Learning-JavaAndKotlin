package in.abhisheksaxena.java.GeeksForGeeks.Inheritance;

import in.abhisheksaxena.java.Utils;

/**
 * @author Abhishek Saxena
 * @since 14/08/19 3:02 PM
 */


class BaseII {
    static void show() {
        Utils.println("Base class show() called");
    }
}

class DerivedII extends BaseII {

    static void show() {
        //super.show();
        Utils.println("Derived class show() called");
    }
}

/**
 * Like C++, when a function is static, runtime polymorphism doesn't happen.
 *
 * Output - Base class show() called
 */

public class BasicsII {
    public static void main(String[] args) {
        BaseII base = new DerivedII();
        base.show();
    }
}
