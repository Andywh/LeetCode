package com.math._050;

/**
 * Created by songliang on 2020/1/18.
 */
public class Solution {
    public double myPow(double x, int n) {
        if (n < 0) return 1 / pow(x, -n);
        return pow(x, n);
    }

    public double pow(double x, int n) {
        if (n == 0) return 1;
        double half = pow(x, n/2);
        if (n % 2 == 0) return half * half;
        return x * half * half;
    }
}
