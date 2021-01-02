package tech.developingdeveloper.java.GeeksForGeeks.Inheritance;

import tech.developingdeveloper.java.Utils;

/**
 * @author Abhishek Saxena
 * @since 14/08/19 3:28 PM
 */

final class Complex {

    private final double re;
    private final double im;

    /*public Complex() {

    }*/

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}

class BaseIV{
    private void fun(){
        Utils.println("Base");
    }
}

class DerivedIV extends BaseIV{
    private void fun(){
        Utils.println("Derived");
    }
}

/**
 * Cannot inherit final class
 */
/*class subComplex extends Complex {

}*/

public class Sample {

    public static void main(String[] args) {
        Complex complex = new Complex(10, 15);
        Utils.println("Complex number is: " + complex);

        BaseIV base = new BaseIV();
        //base.fun();
        // Compilation error as fun() as private access in Base class and it cannot be accessed by its object.
        // Also this proves that the fun() is not overridden in the derived class
    }
}
