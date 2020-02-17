package com.string._030;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if (s == null || "".equals(s) || words == null || words.length == 0) {
            return new ArrayList<Integer>();
        }
        // 将每个单词放到map里去
        Map<String, Integer> wordsMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (wordsMap.containsKey(words[i])) {
                wordsMap.put(words[i], wordsMap.get(words[i]) + 1);
            } else {
                wordsMap.put(words[i], 1);
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        int oneWordLen = words[0].length();
        int totalLen = words.length * oneWordLen;
        for (int i = 0; i < s.length() - totalLen+1; i++) { // 这里 s.length - totalLen + 1 不写 +1，解答错误
            Map<String, Integer> tem = new HashMap<>(wordsMap);
            for (int j = 0; j < totalLen; j+=oneWordLen) {
                String key = s.substring(i+j, oneWordLen+i+j);
                if (tem.containsKey(key)) {
                    tem.put(key, tem.get(key) - 1);
                    if (tem.get(key) == 0) {
                        tem.remove(key);
                    }
                } else {
                    break;
                }
            }
            if(tem.size()==0) {
                res.add(i);
            }

        }
        return res;
    }
}