package com.tree._107;

import com.basic.TreeNode;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Ai Lun on 2019-06-21.
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<TreeNode> queue = new ArrayList<TreeNode>();
        queue.add(root);
        List<List<Integer>> rets = new ArrayList<>();

        while (!queue.isEmpty()) {
            List<Integer> ret = new ArrayList<>();
            List<TreeNode> tempQueue = new ArrayList<TreeNode>();
            for (TreeNode n : queue) {
                ret.add(n.val);
                if (n.left != null) {
                    tempQueue.add(n.left);
                }
                if (n.right != null) {
                    tempQueue.add(n.right);
                }
            }
            queue = tempQueue;
            rets.add(ret);
        }
        Collections.reverse(rets);
        return rets;
    }
}
