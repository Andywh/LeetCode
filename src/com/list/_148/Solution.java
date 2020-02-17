package com.list._148;

import com.basic.ListNode;

/**
 * Created by Ai Lun on 2020-01-02.
 */
public class Solution {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode tem = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(tem);
        ListNode res = new ListNode(0);
        ListNode h = res;
        while (left != null && right != null) {
            if (left.val < right.val) {
                h.next = left;
                left = left.next;
            } else {
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }
        h.next = left == null ? right : left;
        return res.next;
    }

}
