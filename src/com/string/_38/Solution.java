package com.string._38;

/**
 * Created by songliang on 2020/1/14.
 */
public class Solution {
    public String countAndSay(int n) {
        if (n == 0) {
            return "";
        }
        StringBuilder res = new StringBuilder("1");

        for (int i = 0; i < n; i++) {
            StringBuilder s = new StringBuilder("");

            for (int j = 0; j < res.length(); j++) {
                int cnt = 1;
                while(j+1 < res.length() && res.charAt(j) == res.charAt(j+1)) {
                    cnt++;
                    j++;
                }
                s.append(String.valueOf(cnt)+res.charAt(j));
            }
            res = s;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.countAndSay(3);
    }

}
