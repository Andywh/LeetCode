package com.tree._117;

import com.basic.Node;

/**
 * Created by Ai Lun on 2019-06-25.
 */
public class Solution {

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node p = root.next;
        while (p != null) {
            if (p.left != null) {
                p = p.left;
                break;
            }
            if (p.right != null) {
                p = p.right;
                break;
            }
            p = p.next;
        }
        if (root.right != null) {
            root.right.next = p;
        }
        if (root.left != null) {
            root.left.next = root.right != null ? root.right : p;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
}
