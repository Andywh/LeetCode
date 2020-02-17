package com.string._014;

/**
 * Created by Ai Lun on 2020-01-06.
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (strs.length == 0) {
            return "";
        }
        for (int j = 0; j < strs[0].length(); j++) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() < j+1 || strs[i].charAt(j) != strs[0].charAt(j)) {
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(j));
        }
        return sb.toString();
    }

}
