package tech.developingdeveloper.java.GeeksForGeeks.Inheritance;

/**
 * @author Abhishek Saxena
 * @since 14/08/19 4:23 PM
 */

/* Java program to demonstrate whether we can override private method
of outer class inside its inner class */

/**
 * In the above program, we created an outer class and an inner class.
 * We extended Inner from Outer and created a method fun() in both Outer and Inner.
 * If we observe our output, then it is clear that the method fun() has not been overridden.
 * It is so because private methods are bonded during compile time and it is the type of the reference variable – not the type of object that it refers to – that determines what method to be called.
 * As a side note, private methods may be performance-wise better (compared to non-private and non-final methods) due to static binding.
 */
class Outer {
    private String msg = "GeeksforGeeks";

    private void fun() {
        System.out.println("Outer fun()");
    }

    private class Inner extends Outer {
        private void fun() {
            System.out.println("Accessing Private Member of Outer: " + msg);
        }
    }
    public static void main(String args[]) {

        // In order to create instance of Inner class, we need an Outer
        // class instance. So, first create Outer class instance and then
        // inner class instance.
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();

        // This will call Inner's fun, the purpose of this call is to
        // show that private members of Outer can be accessed in Inner.
        i.fun();

        // o.fun() calls Outer's fun (No run-time polymorphism).
        o = i;
        o.fun();
    }
}