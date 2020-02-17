package com.backtracking._051;

import java.util.*;

/**
 * Created by Ai Lun on 2019-10-23.
 */
public class Practice {

    public List<List<Integer>> solveNQueens(int n) {
        List<List<Integer>> res = new ArrayList<>();
        if (n == 0) {
            return res;
        }

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = i;
        }

        Set<Integer> col = new HashSet<>();
        Set<Integer> master = new HashSet<>();
        Set<Integer> slave = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        backtrack(nums, 0, n, col, master, slave, stack, res);
        return res;
    }

    private void backtrack(int[] nums,
                           int row,
                           int n,
                           Set<Integer> col,
                           Set<Integer> master,
                           Set<Integer> slave,
                           Stack<Integer> stack,
                           List<List<Integer>> res) {

        if (row == n) {
            res.add(new ArrayList<>(stack));
            return;
        }

        for (int i = 0; i < n; i++) { // i 表示第多少列，开始递归，然后剪枝回溯
            if (!col.contains(i) && !master.contains(row + i) && !slave.contains(row - i)) {
                stack.add(nums[i]);
                col.add(i);
                master.add(row + i);
                slave.add(row - i);

                backtrack(nums, row + 1, n, col, master, slave, stack, res);

                slave.remove(row - i);
                master.remove(row + i);
                col.remove(i);
                stack.pop();

            }
        }

    }

    public static void main(String[] args) {
        int n = 4;
        Practice practice = new Practice();
        List<List<Integer>> res = practice.solveNQueens(n);
        System.out.println(res);
    }



}
