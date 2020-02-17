package com.backtracking._040;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by Ai Lun on 2020-01-09.
 */
public class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        Stack<Integer> path = new Stack<>();
        backtrack(candidates, target, 0,  path, result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, Stack<Integer> path, List<List<Integer>> result) {
        System.out.println(target);
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }
            if (i > start && candidates[i] == candidates[i-1]) {
                continue;
            }
            System.out.println(path);
            path.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i+1, path, result);
            path.pop();
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{10,1,2,7,6,1,5};
        int target = 8;
        s.combinationSum2(nums, target);
    }

}
