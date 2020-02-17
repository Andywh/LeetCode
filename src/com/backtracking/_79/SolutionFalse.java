package com.backtracking._79;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ai Lun on 2019-10-27.
 */
public class SolutionFalse {

    public boolean exist(char[][] board, String word) {
        List<List<String>> boards = new ArrayList<>();
        for (char[] chars : board) {
            List<String> alphs = new ArrayList<>();
            for (char aChar : chars) {
                alphs.add(String.valueOf(aChar));
            }
            boards.add(alphs);
        }


        boolean[][] isUsed = new boolean[boards.size()][boards.get(0).size()];
        List<String> result = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        backtrack(word, isUsed,  boards, path, result);
        return result.size() > 0;
    }

    private void backtrack(String word, boolean[][] isUsed, List<List<String>> boards, StringBuilder path, List<String> result) {
        if (path.equals(word)) {
            result.add(new String(path));
            return;
        }

        for (int i = 0; i < boards.size(); i++) {
            for (int j = 0; j < boards.get(i).size(); j++) {

                if (!isUsed[i][j]) {
                    isUsed[i][j] = true;
                    path.append(boards.get(i).get(j));
                    backtrack(word, isUsed, boards, path, result);
                    path.deleteCharAt(path.length()-1);
                    isUsed[i][j] = false;
                }
            }
        }

    }

    //public void backtrack(String word, boolean[][] isUsed, int begin, List<List<String>> boards, ) {
    //
    //}


}
