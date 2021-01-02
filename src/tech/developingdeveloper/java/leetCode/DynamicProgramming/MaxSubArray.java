package tech.developingdeveloper.java.leetCode.DynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Abhishek Saxena
 * @since 31/07/19 11:03 PM
 */

class MaxSubArray {
    private int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int tempSum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(tempSum < 0) {
                tempSum = nums[i];
            }else {
                tempSum += nums[i];
            }
            maxSum = Math.max(tempSum, maxSum);

        }

        List<Integer> list = new ArrayList<>();
        for(int i : nums)
            list.add(i);

        String[] strArr = {"abc", "bcd", "def", "geh"};
        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, strArr);
        System.out.println(String.join(", ", stringList));
        System.out.println(list.stream().map(Object::toString).collect(Collectors.joining(", ")));
        System.out.println();
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(new MaxSubArray().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
