package in.abhisheksaxena.java;

import java.util.Scanner;

/**
 * @author Abhishek Saxena
 * @since 04/08/19 1:21 PM
 */

class BaseConversion {
    public static void main(String[] args) {
        String n = new Scanner(System.in).next();

        System.out.println(Integer.toString(Integer.parseInt(n), 2));
    }
}
