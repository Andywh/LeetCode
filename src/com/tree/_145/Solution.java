package com.tree._145;

import com.basic.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Created by Ai Lun on 2019-06-25.
 */
public class Solution {

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> rets = new ArrayList<>();
        if (root == null) {
            return rets;
        }
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            root = s.pop();
            rets.add(root.val);
            if (root.left != null) {
                s.push(root.left);
            }
            if (root.right != null) {
                s.push(root.right);
            }
        }
        Collections.reverse(rets);
        return rets;
    }
}
