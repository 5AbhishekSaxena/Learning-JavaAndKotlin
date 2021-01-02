package tech.developingdeveloper.java;

import java.util.Scanner;

/**
 * @author Abhishek Saxena
 * @since 04/08/19 1:18 PM
 */

class StringPalindrome {
    public static void main(String[] args) {
        //String str = "Hello";
        String str = new Scanner(System.in).next();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString().equals(str));
    }
}
