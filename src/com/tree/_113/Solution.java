package com.tree._113;

import com.basic.TreeNode;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Ai Lun on 2019-06-21.
 */
class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> rets = new ArrayList<>();
        travel(root, sum, new ArrayList<>(), rets);
        return rets;
    }

    private void travel(TreeNode root, int sum, List<Integer> current, List<List<Integer>> rets) {
        if (root == null) {
            return;
        }
        current.add(root.val);
        if (root.left == null && root.right == null) {
            if (sum == root.val) {
                List<Integer> temp = new ArrayList<Integer>();
                for (Integer val : current) {
                    temp.add(val);
                }
                rets.add(temp);
            }
        }
        travel(root.left, sum - root.val, current, rets);
        travel(root.right, sum - root.val, current, rets);
        current.remove(current.size()-1);
    }

}