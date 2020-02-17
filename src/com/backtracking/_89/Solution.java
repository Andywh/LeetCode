package com.backtracking._89;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Ai Lun on 2019-10-28.
 */
public class Solution {

    public List<Integer> grayCode(int n) {

        List<Integer> result = new ArrayList<>();
        int[] nums = new int[n];
        Stack<Integer> path = new Stack();
        dfs(nums, 0, path,result);
        return new ArrayList<>();

    }

    private void dfs(int[] nums, int i, Stack<Integer> path, List<Integer> result) {
        if (path.size() == nums.length) {
            result.add(toNumber(path));
            return;
        }
        return;

        //for (int i = 0; i < nums.length; i++) {
        //    if (result.contains())
        //}

    }

    private int toNumber(Stack<Integer> path) {
        int sum = 0;
        for (int i = path.size() - 1; i >= 0; i++) {
            sum += sum * 2 + path.get(i);
        }
        return 0;
    }

}
