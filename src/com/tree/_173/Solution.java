package com.tree._173;

import com.basic.TreeNode;

import java.util.Stack;

/**
 * Created by Ai Lun on 2019-06-25.
 */

class BSTIterator {

    private Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        pushToStack(root);
    }

    private void pushToStack(TreeNode root) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    public int next() {
        TreeNode curr = stack.pop();
        pushToStack(curr.right);
        return curr.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

}

public class Solution {

}
