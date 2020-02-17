package com.tree._094;

import com.basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ai Lun on 2019-06-14.
 */
public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> l = new ArrayList<>();
        if (root.left != null) {
            l.addAll(inorderTraversal(root.left));
        }
        l.add(root.val);
        if (root.right != null) {
            l.addAll(inorderTraversal(root.right));
        }
        return l;
    }

}
