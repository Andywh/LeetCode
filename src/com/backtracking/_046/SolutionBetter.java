package com.backtracking._046;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Ai Lun on 2019-10-23.
 */
public class SolutionBetter {


    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[len];
        if (len == 0) {
            return res;
        }
        generatePermution(nums, used, 0, len, new Stack<>(), res);
        return res;

    }

    private void generatePermution(int[] nums, boolean[] visited, int curSize, int len, Stack<Integer> path, List<List<Integer>> res) {
        if (curSize == len) {
            res.add(new ArrayList<>(path));
        }

        for (int i = 0; i < len; i++) {
            if (!visited[i]) {
                visited[i] = true;
                path.add(nums[i]);
                generatePermution(nums, visited, curSize + 1, len, path, res);
                path.pop();
                visited[i] = false;
            }
        }
    }

}
