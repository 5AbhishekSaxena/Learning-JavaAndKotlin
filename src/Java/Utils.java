package in.abhisheksaxena.java;

/**
 * Created by Abhishek Saxena on 12-07-2019.
 */

public class Utils {

    public static <E> void print(E param) {
        System.out.print(param);
    }

    public static void println() {
        System.out.println();
    }

    public static <E> void println(E param) {
        System.out.println(param);
    }

    public static void printMemo(int[][] memo, int[] numbers, int sum){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <= sum; j++) {
                print(memo[i][j] + " ");
            }
            println();
        }
    }
}
