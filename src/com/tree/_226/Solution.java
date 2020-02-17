package com.tree._226;

import com.basic.TreeNode;

/**
 * Created by Ai Lun on 2020-01-01.
 */


public class Solution {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

}
