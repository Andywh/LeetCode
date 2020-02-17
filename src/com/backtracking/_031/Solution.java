package com.backtracking._031;

/**
 * Created by songliang on 2020/1/11.
 */
public class Solution {

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i+1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] < nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1);
    }

    private void reverse(int[] nums, int b) {
        int e = nums.length - 1;
        while (b < e) {
            swap(nums, b, e);
            b++;
            e--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tem = nums[i];
        nums[i] = nums[j];
        nums[j] = tem;
    }

}
