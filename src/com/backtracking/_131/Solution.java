package com.backtracking._131;

/**
 * Created by Ai Lun on 2020-01-04.
 */
public class Solution {

    public static void main(String[] args) {
        String s = "aab";
        int len = s.length();
        System.out.println(s.substring(0,len));
        print(0, len, s);
    }

    public static void print(int start, int len, String s) {
        for (int i = start; i < len; i++) {
            String tem = s.substring(start, i+1);
            System.out.println(tem);
            print(start + 1, len, s);
        }
    }
}
