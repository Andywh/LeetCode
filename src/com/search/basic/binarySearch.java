package com.search.basic;

/**
 * Created by Ai Lun on 2019-07-01.
 */
public class binarySearch {

    public static int binarySearch(int a[], int target) {
        int b = 0;
        int e = a.length - 1;
        while (b < e) {
            int mid = b + (e - b) / 2;
            if (a[mid] < target) {
                b = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return b;
    }
}
