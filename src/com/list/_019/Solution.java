package com.list._019;

import com.basic.ListNode;

/**
 * Created by Ai Lun on 2020-01-08.
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        int i = 0;
        while (fast != null) {
            if (i > n) {
                slow = slow.next;
            }
            fast = fast.next;
            i++;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

}
