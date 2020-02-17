package com.array._016;

import java.util.Arrays;

/**
 * Created by Ai Lun on 2020-01-07.
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int b = i + 1;
            int e = nums.length - 1;
            while (b < e) {
                int sum = nums[i] + nums[b] + nums[e];
                if (Math.abs(target - sum) < Math.abs(target - ans)) {
                    ans = sum;
                } else if (sum > target) {
                    e--;
                } else if (sum < target) {
                    b++;
                } else {
                    return ans;
                }
            }
        }
        return ans;
    }

}
