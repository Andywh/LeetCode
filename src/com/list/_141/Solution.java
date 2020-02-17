package com.list._141;

import com.basic.ListNode;

/**
 * Created by Ai Lun on 2020-01-02.
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == null) {
                return false;
            }
            if (slow.val == fast.val) {
                return true;
            }
        }
        return false;
    }

}
