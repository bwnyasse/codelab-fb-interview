package leetcode.Amazon;

import java.util.HashMap;

/**
 * TwoSum
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] values = twoSumWithBruteForce(new int[] { 1, 2, 3, 4 }, 7);
        System.out.println(values[0] + "-" + values[1]);

        values = twoSumWitTwoPassHashTable(new int[] { 1, 2, 3, 4 }, 7);
        System.out.println(values[0] + "-" + values[1]);

        values = twoSumWitOnePassHashTable(new int[] { 1, 2, 3, 4 }, 7);
        System.out.println(values[0] + "-" + values[1]);
    }

    /**
     * Time complexity : O(n^2). For each element, we try to find its complement by
     * looping through the rest of array which takes O(n) time. Therefore, the time
     * complexity is O(n^2).
     * 
     * Space complexity : O(1).
     */
    public static int[] twoSumWithBruteForce(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * Time complexity : O(n). We traverse the list containing n elements exactly
     * twice. Since the hash table reduces the look up time to O(1), the time
     * complexity is O(n).
     * 
     * Space complexity : O(n). The extra space required depends on the number of
     * items stored in the hash table, which stores exactly n elements.
     * 
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumWitTwoPassHashTable(int[] nums, int target) {

        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            maps.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (maps.containsKey(complement) && maps.get(complement) != i) {
                return new int[] { i, maps.get(complement) };
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSumWitOnePassHashTable(int[] nums, int target) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (maps.containsKey(complement)) {
                return new int[] { i, maps.get(complement) };
            }
            maps.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}