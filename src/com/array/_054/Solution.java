package com.array._054;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by songliang on 2020/1/18.
 */
public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int c = Math.min(m, n) + 1 / 2;
        int p = m, q = n;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < c; i++, p-=2, q-=2) {
            for (int col = i; col < i+q; col++) {
                res.add(matrix[i][col]);
            }
            for (int row = i+1; row < i+p; row++) {
                res.add(matrix[row][i+q-1]);
            }
            if (p == 1 || q == 1) break;
            for (int col = i+q-2; col >= i; col--) {
                res.add(matrix[i+p-1][col]);
            }
            for (int row = i+p-2; row > i; --row) {
                res.add(matrix[row][i]);
            }
        }
        return res;
    }

}
