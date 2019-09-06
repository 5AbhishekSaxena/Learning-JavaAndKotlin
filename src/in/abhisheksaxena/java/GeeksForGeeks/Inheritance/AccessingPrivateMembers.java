package in.abhisheksaxena.java.GeeksForGeeks.Inheritance;

import in.abhisheksaxena.java.Utils;

/**
 * @author Abhishek Saxena
 * @since 14/08/19 4:27 PM
 */

class OuterI{
    private String msg = "GeeksForGeeks";

    private void fun(){
        Utils.println("Outer fun()");
    }

    class Inner extends OuterI{
        private void fun(){
            System.out.println("Accessing Private Member of Outer: " + msg);
        }
    }
}

public class AccessingPrivateMembers {
    public static void main(String[] args) {
        OuterI outer = new OuterI();
        OuterI.Inner inner = outer.new Inner();
        //inner.fun();
    }
}
