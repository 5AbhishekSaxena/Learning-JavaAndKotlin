package tech.developingdeveloper.java.Sroting;

/**
 * @author Abhishek Saxena
 * @since 08/08/19 6:25 PM
 */

class MergeSort {
    public static void main(String[] args) {
        int[] A = {2, 5, 8, 18};
        int[] B = {5, 9, 12, 17};
        int[] C = new int[A.length + B.length];

        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length) {
            System.out.print("i: " + i + " j: " + j + " k: " + k + " A[i]: " + A[i] + " B[j]: " + B[j]);
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
            System.out.println(" C[k-1]: " + C[k-1]);
        }

        for (; i < A.length; i++) {
            C[k++] = A[i];
        }

        for (; j < B.length; j++) {
            C[k++] = A[j];
        }

        /*for(i=0;i<C.length;i++)
            System.out.print(C[i] + " ");*/
        for (int ii : C)
            System.out.print(ii + " ");
    }
}
