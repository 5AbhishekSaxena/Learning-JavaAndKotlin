package tech.developingdeveloper.java;

import java.util.Scanner;

public class SubArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //int n = 6; //scanner.nextInt();
        //int[] arr = {1, 2, 3, 4, 5}; //new int[n];

      /*  for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }*/
        /*for(int k = 0; k < n; k++) {
            for (int j = 0; j <= k; j++) {
                for (int i = 0; i <= k; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }*/
/*
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);

        for (int j = 1; j < n; j++){
            for (int i = j - 1; i <= j; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        for (int j = 2; j < n; j++) {
            for (int i = j - 2; i <= j; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        for (int j = 3; j < n; j++) {
            for (int i = j - 3; i <= j; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        for (int j = 4; j < n; j++) {
            for (int i = j - 4; i <= j; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        for (int j = 5; j < n; j++) {
            for (int i = j - 5; i <= j; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }*/

        /*5
        1 -2 4 -5 1*/
        int n = 5;
        int[] arr = {1, -2, 4, -5, 1};
        int sum = 0;
        int count = 0;
        for (int k = 0; k < n; k++) {
            for (int j = k; j < n; j++) {
                sum = 0;
                for (int i = j - k; i <= j; i++) {
//                    System.out.print(arr[i] + " ");
                    sum += arr[i];
                }
//                System.out.println();
                if (sum < 0) {
//                    System.out.println("Sum: " + in.abhisheksaxena.Java.Kotlin.sum);
                    count++;
                }
            }
        }

        System.out.println("count: " + count);
        count = 0;

        for (int j = 0; j < n; j++) {
            sum = 0;
            for (int k = j; k < n; k++) {
                sum = arr[k] + sum;
                if (sum < 0) {
                    count++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                System.out.print(arr[j] + " ");
                sum += arr[j];
                if (sum < 0)
                    count++;
            }
            System.out.println();
        }
        System.out.println("count: " + count);
    }
}

