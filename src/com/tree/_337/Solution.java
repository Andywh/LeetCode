package com.tree._337;

import com.basic.TreeNode;

/**
 * Created by Ai Lun on 2019-06-25.
 */
public class Solution {

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int s0 = 0;
        int s1 = root.val;

        s0 = rob(root.left) + rob(root.right);

        if (root.left != null) {
            s1 += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            s1 += rob(root.right.left) + rob(root.right.right);
        }
        return Math.max(s0, s1);
    }

}
