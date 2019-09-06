package in.abhisheksaxena.java.dynamic_programming.Fibonacci;

/**
 * Created by Abhishek Saxena on 12-07-2019.
 */

import java.util.Scanner;

import static in.abhisheksaxena.java.Utils.print;
import static in.abhisheksaxena.java.Utils.println;

public class Fibonacci {

    public static void main(String[] args) {
        println("Enter number: ");
        int n = new Scanner(System.in).nextInt();

        int[] memo = new int[n + 1];

        memo[0] = 1;
        memo[1] = 1;

        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        for (int i = 0; i < n + 1; i++)
            print(memo[i] + " ");

        println();
        println("Output: " + memo[n]);
    }
}
