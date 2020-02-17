package com.tree._144;

import com.basic.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Ai Lun on 2019-06-25.
 */
public class Solution2 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        if (root != null) {
            s.push(root);
        }
        while (!s.empty()) {
            TreeNode p = s.pop();
            res.add(p.val);
            if (p.right != null) {
                s.push(p.right);
            }
            if (p.left != null) {
                s.push(p.left);
            }
        }
        return res;
    }

}
