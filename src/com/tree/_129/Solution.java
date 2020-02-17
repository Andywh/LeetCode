package com.tree._129;

import com.basic.TreeNode;

/**
 * Created by Ai Lun on 2019-06-25.
 */
public class Solution {
    public int sumNumbers(TreeNode root) {
        return sumNumbersDFS(root, 0);
    }
    private static int sumNumbersDFS(TreeNode root, int sum) {
        if (root == null) return 0;
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) return sum;
        return sumNumbersDFS(root.left, sum) + sumNumbersDFS(root.right, sum);
    }
}
