package tech.developingdeveloper.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Abhishek Saxena
 * @since 04/08/19 1:25 PM
 */

class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 5, 10, 7, 20};
        Set<Integer> set = new HashSet<Integer>();
        for(int i : arr){
            set.add(i);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for (int i : list)
            System.out.print(i + " ");
    }
}
