package com.tree._257;

import com.basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ai Lun on 2019-06-25.
 */
public class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        if (root.left == null && root.right == null) {
            List<String> ret = new ArrayList<>();
            ret.add(""+root.val);
            return ret;
        }
        List<String> rets = new ArrayList<>();
        List<String> left = binaryTreePaths(root.left);
        List<String> right = binaryTreePaths(root.right);
        for (int i = 0; i < left.size(); i++) {
            rets.add("" + root.val + "->" + left.get(i));
        }
        for (int i = 0; i < right.size(); i++) {
            rets.add("" + root.val + "->" + right.get(i));
        }
        return rets;
    }

}
