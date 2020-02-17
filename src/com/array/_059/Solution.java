package com.array._059;

/**
 * Created by songliang on 2020/1/19.
 */
public class Solution {

    public int[][] generateMatrix(int n) {
        int[][] ret = new int[n][n];
        int val = 1;
        int c = (n + 1)/ 2;
        int p = n;
        for (int i = 0; i < c; i++, p -= 2) {
            for (int col = i; col < i+p; col++) {
                ret[i][col] = val++;
            }
            for (int row = i+1; row < i+p; row++) {
                ret[row][i+p-1] = val++;
            }

            for (int col = i+p-2; col >= i; col--) {
                ret[i+p-1][col] = val++;
            }
            for (int row = i+p-2; row > i; row--) {
                ret[row][i] = val++;
            }
        }
        if (n % 2 != 0) ret[n/2][n/2] = val;
        return ret;
    }

}
