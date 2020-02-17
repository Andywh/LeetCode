package com.list._203;

import com.basic.ListNode;

/**
 * Created by Ai Lun on 2020-01-01.
 */
public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        return head;
    }


}
