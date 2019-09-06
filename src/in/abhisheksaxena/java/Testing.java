package in.abhisheksaxena.java;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Abhishek Saxena on 26-09-2018.
 */

public class Testing {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.format("Array is sorted in %d swaps \nFirst element: %d \nLast Element: %d", numberOfSwaps, a[0], a[a.length-1]);
    }
}

