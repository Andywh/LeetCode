package com.tree._429;


import java.util.*;

/**
 * Created by Ai Lun on 2019-06-26.
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class Solution {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> rets = new ArrayList<>();
        if (root == null) {
            return rets;
        }
        List<Node> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            List<Integer> ret = new ArrayList<>();
            List<Node> temStack = new Stack<>();
            for (Node n : stack) {
                ret.add(n.val);
                for (Node child : n.children) {
                    temStack.add(child);
                }
            }
            stack = temStack;
            rets.add(ret);
        }
        return rets;
    }

}
