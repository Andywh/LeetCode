package com.tree._100;

import com.basic.TreeNode;

/**
 * Created by Ai Lun on 2019-06-20.
 */
public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.right,q.right) && isSameTree(p.left,q.left);
    }
}
