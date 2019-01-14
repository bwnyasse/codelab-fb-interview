package leetcode.Amazon.datastructures.arrayandstrings;

import java.util.ArrayList;
import java.util.List;

/**
 * MaximumSizeSubArraySumEqualsK
 */
public class MaximumSizeSubArraySumEqualsK {

    public static void main(String[] args) {
        int[] nums = { -2, -1, 2, 1 };
        System.out.println(maxSubArrayLen(nums, 3));
    }

    public static int maxSubArrayLen(int[] nums, int k) {


        int size = 0;
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            res = 0;
            List<Integer> temp = new ArrayList<>();
            for (int j = i; j < nums.length; j++) {
                res += nums[j];
                temp.add(nums[j]);

                if (res == k) {
                    if (temp.size() > size) {
                        size = temp.size();
                    }
                }
            }
        }
        return size;
    }
}