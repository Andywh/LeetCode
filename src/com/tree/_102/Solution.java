package com.tree._102;

import com.basic.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Ai Lun on 2019-06-20.
 * Use
 *
 * List<List<Integer>> list = new ArrayList<List<Integer>>();
 * or since Java 1.7
 *
 * List<List<Integer>> list = new ArrayList<>();
 *
 */
public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        List<List<Integer>> rets = new ArrayList<>();
        while (queue.size() != 0) {
            List<Integer> ret = new ArrayList<>();
            List<TreeNode> temQueue = new ArrayList<>();
            for (TreeNode n : queue) {
                ret.add(n.val);
                if (n.left != null) {
                    temQueue.add(n.left);
                }
                if (n.right != null) {
                    temQueue.add(n.right);
                }
            }
            queue = temQueue;
            rets.add(ret);
        }
        return rets;
    }
}
