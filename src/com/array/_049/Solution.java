package com.array._049;

import java.util.*;

/**
 * Created by songliang on 2020/1/18.
 */
public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for (String str : strs) {
            String sortStr = sort(str);
            if (m.containsKey(sortStr)) {
                m.get(sortStr).add(str);
            } else {
                List l = new ArrayList();
                l.add(sortStr);
                m.put(sortStr, l);
            }
        }

        for (String key : m.keySet()) {
            res.add(m.get(key));
        }
        return res;
    }

    private String sort(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < sb.length() - i - 1; j++) {
                if (sb.charAt(j) > sb.charAt(j+1)) {
                    char tem = sb.charAt(j);
                    sb.setCharAt(j, sb.charAt(j+1));
                    sb.setCharAt(j+1, tem);
                }
            }
        }
        return sb.toString();
    }

}
