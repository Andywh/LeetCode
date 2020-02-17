package com.string._028;

/**
 * Created by Ai Lun on 2020-01-08.
 */
public class Solution {

    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 0;
                for (; j < needle.length(); j++) {
                    if (haystack.charAt(i+j) != needle.charAt(j)) {
                        break;
                    }
                }
                if (j+1 == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }

}
