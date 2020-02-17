package com.sort.basic;

/**
 * Created by Ai Lun on 2019-06-14.
 */
public class Solution {

    public static void quick(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }

        int l = left;
        int r = right;
        int key = a[l];

        while (l < r) {
            while (l < r && a[r] > key) {
                r--;
            }
            if (l < r) {
                a[l] = a[r];
                l++;
            }
            while (l < r && a[l] < key) {
                l++;
            }
            if (l < r) {
                a[r] = a[l];
                r--;
            }
        }
        a[l] = key;
        quick(a, left, l-1);
        quick(a, l+1, right);
    }

    public static void main(String[] args) {
        int[] a = new int[]{4, 6, 3, 1, 2, 5, 7};
        quick(a, 0, a.length-1);
    }
}
