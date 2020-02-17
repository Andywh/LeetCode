package com.backtracking._017;

import java.util.*;

/**
 * Created by Ai Lun on 2019-10-21.
 */
public class Solution {

    public static List<String> letterCombinations(String digits) {
        Map<String, String[]> m = new HashMap<>();
        m.put("2", new String[] {"a", "b", "c"});
        m.put("3", new String[] {"d", "e", "f"});
        m.put("4", new String[] {"g", "h", "i"});
        m.put("5", new String[] {"j", "k", "l"});
        m.put("6", new String[] {"m", "n", "o"});
        m.put("7", new String[] {"p", "q", "r", "s"});
        m.put("8", new String[] {"t", "u", "v"});
        m.put("9", new String[] {"w", "x", "y", "z"});
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            String digit = String.valueOf(digits.charAt(i));
            if (m.containsKey(digit)) {
                list.add(Arrays.asList(m.get(digit)));
            }
        }

        return generateCombinations(list);
    }

    private static List<String> generateCombinations(List<List<String>> list) {
        if (list.isEmpty()) {
            return new ArrayList<>();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        List<String> ret = new ArrayList<>();
        for (String letter : list.get(0)) {
            List<String> tempList = generateCombinations(list.subList(1, list.size()));
            for (String tem : tempList) {
                ret.add(letter+tem);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        List<String> result = letterCombinations("23");
        System.out.println(result);
    }


}
