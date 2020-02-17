package com.array._036;

/**
 * Created by songliang on 2020/1/13.
 */
public class Solution {

    public boolean isValidSudoku(char[][] board) {
        int N = board.length;
        boolean[][] rowValid = new boolean[N][N];
        boolean[][] colValid = new boolean[N][N];
        boolean[][] blockValid = new boolean[N][N];
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (board[row][col] != '.') {
                    int c = board[row][col] - '1';
                    int blockIndex = row / 3 * 3 + col / 3;
                    if (rowValid[row][c] || colValid[col][c] || blockValid[blockIndex][c]) {
                        return false;
                    }
                    rowValid[row][c] = true;
                    colValid[col][c] = true;
                    blockValid[blockIndex][c]= true;

                }
            }
        }
        return true;
    }

}
