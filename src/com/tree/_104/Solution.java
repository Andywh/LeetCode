package com.tree._104;

import com.basic.TreeNode;

/**
 * Created by Ai Lun on 2019-06-20.
 */
public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if (left > right) {
            return left + 1;
        }
        return right + 1;
    }
}
