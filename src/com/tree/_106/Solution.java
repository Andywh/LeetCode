package com.tree._106;

import com.basic.TreeNode;

import java.util.Arrays;

/**
 * Created by Ai Lun on 2019-06-21.
 */
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) return null;
        int rootVal = postorder[postorder.length-1];
        TreeNode n = new TreeNode(rootVal);
        if (inorder.length == 1) return n;

        int p = 0;
        while (p < inorder.length) {
            if (rootVal == inorder[p]) {
                break;
            }
            p++;
        }
        n.left = buildTree(Arrays.copyOfRange(inorder, 0, p), Arrays.copyOfRange(postorder, 0, p));
        n.right = buildTree(Arrays.copyOfRange(inorder, p+1, inorder.length), Arrays.copyOfRange(postorder, p, postorder.length-1));
        return n;
    }
}