package com.backtracking._046;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ai Lun on 2019-10-21.
 */
public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        return backtracking(result, nums, 0);
    }

    private List<List<Integer>> backtracking(List<List<Integer>> result, int[] nums, int pos) {
        if (pos == nums.length) {
            return result;
        }
        System.out.println("result " + result);
        List<List<Integer>> newResult = new ArrayList<>();
        for (List<Integer> eachList : result) {
            System.out.println("eachList" + eachList);
            for (int i = 0; i <= eachList.size(); i++) {
                List<Integer> newList = new ArrayList<>(eachList);
                newList.add(i, nums[pos]);
                newResult.add(newList);
            }
        }
        result = newResult;
        return backtracking(result, nums, pos + 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution s = new Solution();
        System.out.println(s.permute(nums));
    }


}
