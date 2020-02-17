package com.tree._101;

import com.basic.TreeNode;

/**
 * Created by Ai Lun on 2019-06-20.
 */
public class Solution {

    public boolean isEqual(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        return isEqual(left.left, right.right) && isEqual(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isEqual(root.left, root.right);
    }

}
