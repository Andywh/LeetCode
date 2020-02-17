package com.backtracking._051;

import java.util.*;

/**
 * Created by Ai Lun on 2020-01-04.
 */
public class Practice2020 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        Stack<Integer> path = new Stack();
        Set<Integer> master = new HashSet<>();
        Set<Integer> slave = new HashSet<>();
        Set<Integer> used = new HashSet<>();
        backtrack(n, 0, used, master, slave, path, result);
        return result;
    }

    public void backtrack(int n, int row, Set<Integer> used, Set<Integer> master, Set<Integer> slave, Stack<Integer> path, List<List<String>> result) {
        if (row == n) {
            List<Integer> tem = new ArrayList<>(path);
            result.add(convert(tem));
            //System.out.println(tem);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (used.contains(i) || master.contains(i+row) || slave.contains(i-row)) {
                continue;
            }
            used.add(i);
            master.add(i+row);
            slave.add(i-row);
            path.add(i);
            backtrack(n, row+1, used, master, slave, path, result);
            used.remove(i);
            master.remove(i+row);
            slave.remove(i-row);
            path.pop();
        }
    }

    public List<String> convert(List<Integer> solution) {
        List<String> result = new ArrayList<>();
        int n = solution.size();
        for (Integer pos : solution) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (i == pos) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            result.add(sb.toString());
        }
        return result;
    }

    public static void main(String[] args) {
        Practice2020 practice2020 = new Practice2020();
        List<List<String>> lists = practice2020.solveNQueens(4);
        System.out.println(lists);
    }

}
