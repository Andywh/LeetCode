package com.backtracking._077;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Ai Lun on 2019-10-24.
 */
public class Solution {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Stack<Integer> path = new Stack<>();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        boolean[] used = new boolean[n];
        backtrack(nums, used, n, k, path, result);
        return result;
    }

    private void backtrack(int[] nums, boolean[] used, int n, int k, Stack<Integer> path, List<List<Integer>> result) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
        }

        for (int i = 0; i < n; i++) {
            if(!used[i]) {
                if (!path.isEmpty() && path.peek() > nums[i]) {
                    continue;
                }
                path.add(nums[i]);
                used[i] = true;
                backtrack(nums, used, n, k, path, result);
                used[i] = false;
                path.pop();
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.combine(4, 2));
        //Stack<Integer> s2 = new Stack<>();
        //s2.push(1);
        //s2.push(2);
        //s2.push(3);
        //s2.push(4);
        //System.out.println(s2.peek());
        //System.out.println(s2);

    }

}
