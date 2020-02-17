package com.backtracking._78;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Ai Lun on 2019-10-25.
 */
public class Solution {

    //public List<List<Integer>> subsets(int[] nums) {
    //    List<List<Integer>> result = new ArrayList<>();
    //    Stack<Integer> path = new Stack<>();
    //    int size = nums.length;
    //    backtrack(nums,0, size, path, result);
    //    return result;
    //}
    //
    //private void backtrack(int[] nums, int begin, int size, Stack<Integer> path, List<List<Integer>> result) {
    //    result.add(new ArrayList<>(path));
    //
    //    for (int i = begin; i < size; i++) {
    //        path.add(nums[i]);
    //        backtrack(nums, i + 1, size, path, result);
    //        path.pop();
    //    }
    //}
    //
    //public static void main(String[] args) {
    //    Solution s = new Solution();
    //    System.out.println(s.subsets(new int[] {1,2,3}));
    //}

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Stack<Integer> path = new Stack<>();
        backtrack(nums, 0, path, result);
        return result;
    }

    private static void backtrack(int[] nums, int start, Stack<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(nums, i + 1, path, result);
            path.pop();
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        System.out.println(subsets(nums));
    }

}

