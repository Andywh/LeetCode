package com.tree._103;

import com.basic.TreeNode;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Ai Lun on 2019-06-20.
 */
public class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        List<List<Integer>> rets = new ArrayList<>();
        Boolean zigzag = false;
        while (!queue.isEmpty()) {
            List<TreeNode> tempQueue = new ArrayList<>();
            List<Integer> ret = new ArrayList<>();
            for (TreeNode n : queue) {
                if (zigzag) {
                    ret.add(0, n.val);
                } else {
                    ret.add(n.val);
                }
                if (n.left != null) {
                    tempQueue.add(n.left);
                }
                if (n.right != null) {
                    tempQueue.add(n.right);
                }
            }
            zigzag = !zigzag;
            queue = tempQueue;
            rets.add(ret);
        }
        return rets;
    }


}
