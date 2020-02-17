package com.tree._095;

import com.basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ai Lun on 2019-06-14.
 * Q: 给定一个整数 n，生成所有由 1 ... n 为节点所组成的二叉搜索树。
 */
public class Solution {

    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> l = new ArrayList<>();
        if (n == 0) {
            return l;
        }
        l = createBST(1, n);
        return l;
    }

    public List<TreeNode> createBST(int start, int end) {
        List<TreeNode> l = new ArrayList<>();
        if (start > end) {
            l.add(null);
            return l;
        }
        for (int i = start; i <= end; i++) {
            for (TreeNode left : createBST(start, i - 1)) {
                for (TreeNode right : createBST(i+1, end)) {
                    l.add(new TreeNode(i));
                    l.get(l.size()-1).left = left;
                    l.get(l.size()-1).right = right;
                }
            }
        }
        return l;
    }

}
