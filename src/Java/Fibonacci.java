package in.abhisheksaxena.java;

/**
 * Created by Abhishek Saxena on 12-07-2019.
 */

public class Fibonacci {

    private static int fibonacci(int n) {
        if(n<=0)
            return 0;
        if (n <= 3) {
            //System.out.print(1 + " ");
            return 1;
        } else {
            //int num = fibonacci(n - 2) + fibonacci(n - 1);
            //System.out.print(num + " ");
            return /*num*/ fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(5));
    }
}
