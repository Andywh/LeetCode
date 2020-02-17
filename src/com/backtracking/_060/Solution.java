package com.backtracking._060;

import java.util.Stack;

/**
 * Created by Ai Lun on 2019-10-24.
 */
public class Solution {

    public String getPermutation(int n, int k) {

        int[] facts = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3265920};
        boolean[] used = new boolean[n];
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
        }
        Stack<Integer> path = new Stack<>();
        backtrack(nums, used, n, k, facts, path);
        StringBuilder sb = new StringBuilder();
        for (Integer i : path) {
            sb.append(""+i);
        }
        return sb.toString();

    }

    public void backtrack(int[] nums, boolean[] used, int n, int k, int[] facts, Stack<Integer> path) {
        if (path.size() == n) {
            return;
        }

        int spices = facts[n-path.size()-1];
        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                if (spices < k) {
                    k -= spices;
                    continue;
                }
                path.add(nums[i]);
                used[i] = true;
                backtrack(nums, used, n, k, facts, path);
            }
        }

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String tem = s.getPermutation(4, 9);
        System.out.println(tem);
    }

}
