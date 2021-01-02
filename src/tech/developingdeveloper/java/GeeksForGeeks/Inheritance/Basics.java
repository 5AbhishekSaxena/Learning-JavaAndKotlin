package tech.developingdeveloper.java.GeeksForGeeks.Inheritance;

import tech.developingdeveloper.java.Utils;

/**
 * @author Abhishek Saxena
 * @since 14/08/19 2:55 PM
 */

class BaseI{
    public void show(){
        Utils.println("Base class show() called");
    }
}

class DerivedI extends BaseI{

    @Override
    public void show() {
        //super.show();
        Utils.println("Derived class show() called");
    }
}

/**
 * In the above program, b is a reference of Base type and refers to an abject of Derived class.
 * In Java, functions are virtual by default. So the run time polymorphism happens and derived fun() is called.
 *
 * Output -  Derived class show() called
 */

public class Basics {

    public static void main(String[] args) {

        BaseI base = new DerivedI();
        base.show();
    }
}
