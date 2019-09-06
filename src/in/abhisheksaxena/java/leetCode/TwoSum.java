package in.abhisheksaxena.java.leetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import in.abhisheksaxena.java.Utils;

/**
 * @author Abhishek Saxena
 * @since 31/07/19 8:48 PM
 */

class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 11, 25, 5, 1};
        int target = 26;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                Utils.println(map.get(complement) + " " + i);
            } else
                map.put(nums[i], i);
        }

        /*for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                System.out.println(i + " " + map.get(complement));
                break;
            }
        }*/
    }
}
