package com.tree._144;

import com.basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ai Lun on 2019-06-25.
 */
public class Solution1 {

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        List<Integer> rets = new ArrayList<>();
        rets.add(root.val);
        if (root.left != null) {
            rets.addAll(preorderTraversal(root.left));
        }
        if (root.right != null) {
            rets.addAll(preorderTraversal(root.right));
        }
        return rets;
    }

}
