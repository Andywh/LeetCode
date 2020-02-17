package com.tree._114;

import com.basic.TreeNode;

import java.util.List;

/**
 * Created by Ai Lun on 2019-06-24.
 */
public class Solution {

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            flatten(root.left);
        }
        if (root.right != null) {
            flatten(root.right);
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        while (root.right != null) {
            root = root.right;
        }
        root.right = temp;
    }

}
