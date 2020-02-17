package com.backtracking._39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by Ai Lun on 2019-10-22.
 */
public class Solution {

    //private void dfs(int[] candidates, int begin, int size, List<Integer> path, List<List<Integer>> result, int target) {
    //    if (target == 0) {
    //        result.add(new ArrayList<>(path));
    //    }
    //
    //    for (int i = begin; i < size; i++) {
    //        int residue = target - candidates[i];
    //        if (residue < 0) {
    //            break;
    //        }
    //        path.add(candidates[i]);
    //        dfs(candidates, i, size, path, result, residue);
    //        path.remove(path.size()-1);
    //    }
    //}
    //
    //public List<List<Integer>> combinationSum(int[] candidates, int target) {
    //
    //    int size = candidates.length;
    //    if (size == 0) {
    //        return new ArrayList<>();
    //    }
    //    Arrays.sort(candidates);
    //    List<Integer> path = new ArrayList<>();
    //    List<List<Integer>> result = new ArrayList<>();
    //    dfs(candidates, 0, size, path, result, target);
    //    return result;
    //}
    //
    //public static void main(String[] args) {
    //    int[] candidates = {2, 3, 6, 7};
    //    int target = 7;
    //    SolutionFalse s = new SolutionFalse();
    //    List<List<Integer>> lists = s.combinationSum(candidates, target);
    //    System.out.println(lists);
    //}

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int size = candidates.length;
        if (size == 0) {
            return new ArrayList<>();
        }
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(candidates, 0, size, path, result, target);
        return result;
    }

    private void dfs(int[] candidates, int begin, int size, List<Integer> path, List<List<Integer>> result, int target) {

        if (target == 0) {
            result.add(new ArrayList<>(path));
        }

        for (int i = begin; i < size; i++) {
            int residue = target - candidates[i];
            if (residue < 0) {
                break;
            }
            path.add(candidates[i]);
            dfs(candidates, i, size, path, result, residue);
            path.remove(path.size() - 1);
        }

    }


}
