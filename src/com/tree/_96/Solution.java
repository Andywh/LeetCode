package com.tree._96;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ai Lun on 2019-06-19.
 */
public class Solution {

    public int numTrees(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] nums = new int[n+1];
        nums[0] = 1;
        nums[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                nums[i] = nums[i] + nums[j] * nums[i-1-j];
            }
        }
        return nums[n];
    }


}
