package com.backtracking._047;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by Ai Lun on 2020-01-08.
 */
public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Stack<Integer> path = new Stack<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, path, result);
        return result;
    }

    public void backtrack(int[] nums, boolean[] used, Stack<Integer> path, List<List<Integer>> result) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && !used[i - 1] && nums[i] == nums[i - 1]) { //去重
                continue;
            }
            used[i] = true;
            path.push(nums[i]);
            backtrack(nums, used, path, result);
            path.pop();
            used[i] = false;
        }
    }
}
