package in.abhisheksaxena.java.dynamic_programming.Fibonacci;

import java.util.Scanner;

import static in.abhisheksaxena.java.Utils.print;
import static in.abhisheksaxena.java.Utils.println;

/**
 * Created by Abhishek Saxena on 12-07-2019.
 */
//NOT a preferred solution
public class RecursionAndMemoFibonacci {

    private static int[] memo;

    private static int fib(int n) {
        if (memo[n] != 0)
            return memo[n];

        int result;

        if (n == 1 || n == 0)
            result = 1;
        else
            result = fib(n - 1) + fib(n - 2);
        memo[n] = result;

        return result;
    }

    public static void main(String[] args) {
        println("Enter number: ");
        int n = new Scanner(System.in).nextInt();

        memo = new int[n + 1];

        memo[0] = 1;
        memo[1] = 1;

        fib(n);

        for (int i = 0; i < n + 1; i++)
            print(memo[i] + " ");

        println();
        println("Output: " + memo[n]);
    }
}
