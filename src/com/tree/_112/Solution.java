package com.tree._112;

import com.basic.TreeNode;

/**
 * Created by Ai Lun on 2019-06-21.
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && root.val == sum) {
            return true;
        }
        if (root.left == null && root.right == null && root.val != sum) {
            return false;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
