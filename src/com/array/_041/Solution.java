package com.array._041;

/**
 * Created by songliang on 2020/1/14.
 */
public class Solution {

    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i+1) {
                if (nums[i] <= 0 || nums[i] > nums.length || nums[i] == nums[nums[i] - 1]) {
                    break;
                }
                int idx = nums[i] - 1;
                nums[i] = nums[idx];
                nums[idx] = idx + 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i+1) {
                return i+1;
            }
        }
        return nums.length + 1;
    }

}
