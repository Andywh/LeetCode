package com.backtracking._090;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ai Lun on 2019-10-28.
 */
public class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0, path, result);
        return result;
    }

    private void dfs(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i-1]) {
                continue;
            }
            path.add(nums[i]);
            dfs(nums, i+1, path, result);
            path.remove(path.size() -1 );
        }
    }

}
