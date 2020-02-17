package com.backtracking._79;

/**
 * Created by Ai Lun on 2019-10-28.
 */
public class Solution {

    public boolean exist(char[][] board, String word) {
        //         x-1,y
        // x, y-1   x,y   x+1,y
        //         x,y+1
        int[][] direction = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        int m = board.length;
        if (m == 0) {
            return false;
        }
        int n = board[0].length;
        boolean[][] isUsed= new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, m, n, isUsed, direction, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int m, int n, boolean[][] isUsed, int[][] direction, int i, int j, int start, String word) {
        if (start == word.length() - 1) {
            return board[i][j] == word.charAt(start);
        }
        if (board[i][j] == word.charAt(start)) {
            isUsed[i][j] = true;
            for (int k = 0; k < 4; k++) {
                int newX = i + direction[k][0];
                int newY = j + direction[k][1];
                if (inArea(newX, newY, m, n) && !isUsed[newX][newY]) {
                    if (dfs(board, m, n, isUsed, direction, newX, newY, start + 1, word)) {
                        return true;
                    }
                }
            }
            isUsed[i][j] = false;
        }
        return false;
    }

    private boolean inArea(int x, int y, int m, int n) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

}
