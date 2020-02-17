package com.backtracking._022;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ai Lun on 2019-10-21.
 */
public class Solution {

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateParenthesisDFS(n, n, "", res);
        return res;
    }

    private static void generateParenthesisDFS(int left, int right, String out, List<String> res) {
        if (left > right || left < 0 || right < 0) return;
        if (left == 0 && right == 0) {
            res.add(out);
        } else {
            //if (left > 0) {
            generateParenthesisDFS(left - 1, right, out + "(", res);
            //}
            //if (right > 0) {
            generateParenthesisDFS(left, right - 1, out + ")", res);
            //}
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }


}
