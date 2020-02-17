package com.tree._105;

import com.basic.TreeNode;

import java.util.Arrays;

/**
 * Created by Ai Lun on 2019-06-20.
 */
public class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        int rootVal = preorder[0];
        TreeNode node = new TreeNode(rootVal);
        if (preorder.length == 1) {
            return node;
        }
        int p = 0;
        while (p < inorder.length) {
            if (rootVal == inorder[p]) {
                break;
            }
            p++;
        }
        node.left = buildTree(Arrays.copyOfRange(preorder, 1, p+1), Arrays.copyOfRange(inorder, 0, p));
        node.right = buildTree(Arrays.copyOfRange(preorder, p+1, preorder.length), Arrays.copyOfRange(inorder, p+1, inorder.length));
        return node;
    }
}
