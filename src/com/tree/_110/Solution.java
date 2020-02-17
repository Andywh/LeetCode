package com.tree._110;

import com.basic.TreeNode;

/**
 * Created by Ai Lun on 2019-06-21.
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(Depth(root.left) - Depth(root.right)) > 1)
            return false;
        else
            return isBalanced(root.left) && isBalanced(root.right);
    }

    private int Depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(Depth(root.left), Depth(root.right)) + 1;
    }
}
