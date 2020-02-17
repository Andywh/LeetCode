package com.backtracking._051;

import java.util.*;

/**
 * Created by Ai Lun on 2019-10-23.
 */
public class Solution {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
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

    private void backtrack(int[] nums, int row, int n,
                           Set<Integer> col, // 列状态
                           Set<Integer> master, // 主对角线状态
                           Set<Integer> slave, // 副对角线状态
                           Stack<Integer> stack, // 记录解法 [1, 3, 0, 2] 具体的列值，index 为行
                           List<List<String>> res) {
        if (row == n) {
            List<String> board = convert2board(stack, n);
            res.add(board);
            return;
        }

        // 针对每一列，尝试是否可以放置
        for (int i = 0; i < n; i++) {
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

    private List<String> convert2board(Stack<Integer> stack, int n) {
        List<String> board = new ArrayList<>();
        for (Integer num : stack) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                stringBuilder.append(".");
            }
            stringBuilder.replace(num, num + 1, "Q");
            board.add(stringBuilder.toString());
        }
        return board;
    }


    public static void main(String[] args) {
        int n = 4;
        Solution solution = new Solution();
        List<List<String>> res = solution.solveNQueens(n);
        System.out.println(res);
    }

}
