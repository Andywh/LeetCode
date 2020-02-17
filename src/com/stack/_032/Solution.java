package com.stack._032;

import java.util.Stack;

/**
 * Created by songliang on 2020/1/12.
 */
public class Solution {

    public int longestValidParentheses(String s) {
        int maxLen = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    if (i - stack.peek() > maxLen) {
                        maxLen = i - stack.peek();
                    }
                }
            }
        }
        return maxLen;
    }

}
