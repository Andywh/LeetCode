package com.string._020;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Ai Lun on 2020-01-06.
 */
public class Solution {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Character[] left = new Character[]{'{', '[', '('};
        Character[] right = new Character[]{'}', ']', ')'};
        Map<Character, Character> m = new HashMap<>();
        m.put('{', '}');
        m.put('[', ']');
        m.put('(', ')');
        Stack<Character> stack = new Stack<>();
        stack.push('?');
        for (Character c : s.toCharArray()) {
            if (m.containsKey(c)) {
                stack.push(c);
            } else if (m.get(stack.pop()) != c) {
                return false;
            }
        }
        return stack.size() == 1;
    }

}
