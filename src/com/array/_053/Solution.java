package com.array._053;

/**
 * Created by songliang on 2020/1/18.
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        int maxRes = Integer.MIN_VALUE;
        int curSum = 0;
        for (int num : nums) {
            curSum = Math.max(num + curSum, curSum);
            maxRes = Math.max(curSum, maxRes);
        }
        return maxRes;
    }
}
