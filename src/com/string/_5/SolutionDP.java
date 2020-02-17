package com.string._5;

/**
 * Created by Ai Lun on 2020-01-06.
 */
public class SolutionDP {

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxLen = 0;
        int b = 0;
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        for (int j = 0; j < len; j++) {
            for (int i = 0; i <= j; i++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i < 3) { // 长度小于等于 3 的时候 j - i + 1 <= 3 就是 j - i < 3
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                } else {
                    dp[i][j] = false;
                }
                System.out.println("dp["+i+"]["+j+"] " + dp[i][j]);
                if(dp[i][j]) {
                    if (j - i + 1 > maxLen) {
                        b = i;
                        maxLen = j - i + 1;
                    }
                }
            }
        }
        return s.substring(b, maxLen+b);
    }

    public static void main(String[] args) {
        SolutionDP solutionDP = new SolutionDP();
        solutionDP.longestPalindrome("ac");
    }

}
