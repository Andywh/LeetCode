package com.array._15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ai Lun on 2020-01-08.
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            int b = i + 1, e = nums.length - 1;
            while (b < e) {
                int sum = nums[i] + nums[b] + nums[e];
                if (sum < 0) {
                    b++;
                } else if (sum > 0) {
                    e--;
                } else {
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[b]);
                    res.add(nums[e]);
                    result.add(res);
                    while (b < e && nums[b] == nums[b+1]) {
                        b++;
                    }
                    while (b < e && nums[e] == nums[e-1]) {
                        e--;
                    }
                    b++;
                    e--;
                }
            }
        }
        return result;

    }

}
