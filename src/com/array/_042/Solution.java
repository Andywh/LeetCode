package com.array._042;

/**
 * Created by songliang on 2020/1/14.
 * 方法一：暴力枚举法
 */
public class Solution {

    public int trap(int[] height) {
        if (height.length < 3) return 0;
        int total = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int leftMaxHeight = getLeftHeight(height, i);
            int rightMaxHeight = getRightHeight(height, i);
            int water = Math.max(Math.min(leftMaxHeight, rightMaxHeight) - height[i] , 0);
            total += water;
        }
        return total;
    }

    private int getLeftHeight(int[] height, int cur) {
        int start = cur-1;
        int max = height[start];
        while (start >= 1) {
            if (height[start-1] >= height[start]) {
                max = height[start-1];
                start--;
            }
        }
        return max;
    }

    private int getRightHeight(int[] height, int cur) {
        int start = cur+1;
        int max = height[start];
        while (start <= height.length - 2) {
            if (height[start+1] >= height[start]) {
                max = height[start+1];
                start++;
            } else {
                break;
            }
        }
        return max;
    }

}
