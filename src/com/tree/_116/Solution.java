package com.tree._116;

import com.basic.Node;

/**
 * Created by Ai Lun on 2019-06-25.
 */
public class Solution {

    public Node connect(Node root) {
        if (root == null) return null;
        if (root.left != null) {
            root.left.next = root.right;
        }
        if (root.right != null) {
            root.right.next = root.next != null ? root.next.left : null;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }

}
