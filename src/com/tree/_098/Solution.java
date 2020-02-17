package com.tree._098;

import com.basic.TreeNode;

/**
 * Created by Ai Lun on 2019-06-19.
 */
public class Solution {

    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    public boolean isValid(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if (min != null && root.val <= min) return false;
        if (max != null && root.val >= max) return false;

        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
    }

}
