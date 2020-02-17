package com.string._043;

/**
 * Created by songliang on 2020/1/15.
 */
public class Solution {

    public String multiply(String num1, String num2) {
        int N1 = num1.length();
        int N2 = num2.length();
        int[] v = new int[N1+N2];
        for (int i = 0; i < N1; i++) {
            for (int j = 0; j < N2; j++) {
                v[N1 + N2 - 2 - i - j] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        int[] ret = new int[N1+N2];
        int carry = 0;
        for (int i = 0; i < v.length; i++) {
            ret[i] = (v[i] + carry) % 10;
            carry = (v[i] + carry) / 10;
        }
        int j = N1 + N2 - 1;
        while (ret[j] == 0) {
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = j; i >= 0; i--) {
            sb.append(String.valueOf(ret[i]));
        }
        for (int n : ret) {
            System.out.println(n);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.multiply("23", "12");
    }

}
