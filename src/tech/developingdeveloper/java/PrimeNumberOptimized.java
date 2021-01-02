package tech.developingdeveloper.java;

import java.util.Scanner;

/**
 * Created by Abhishek Saxena on 27-09-2018.
 */

public class PrimeNumberOptimized {

    private static void checkPrime(int n) {
        boolean flag = true;
        if (n == 1) {
            flag = false;
        } else {
            int sq = (int) Math.sqrt(n);
            for (int i = 2; i <= sq; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            checkPrime(arr[i]);
        }
    }
}