package com.backtracking._017;

import java.util.*;

/**
 * Created by Ai Lun on 2020-01-07.
 */
public class SolutionP {

    public List<String> letterCombinations(String digits) {
        Map<Character, String> m = new HashMap<>();
        m.put('2', "abc");
        m.put('3', "def");
        m.put('4', "ghi");
        m.put('5', "jkl");
        m.put('6', "mno");
        m.put('7', "pqrs");
        m.put('8', "tuv");
        m.put('9', "wxyz");
        List<String> result = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        boolean[] used = new boolean[digits.length()];
        char[] digtisArray = digits.toCharArray();
        backtrack(digtisArray, 0, m, path, result);
        return result;
    }

    private void backtrack(char[] digtisArray, int index, Map<Character, String> m, StringBuilder path, List<String> result) {
        if (path.length() == digtisArray.length) {
            result.add(new String(path.toString()));
            return;
        }
        String letters = m.get(digtisArray[index]);
        for (int i = 0; i < letters.length(); i++) {
            path.append(letters.charAt(i));
            backtrack(digtisArray, index + 1, m, path, result);
            path.deleteCharAt(path.length()-1);
        }
    }


}
