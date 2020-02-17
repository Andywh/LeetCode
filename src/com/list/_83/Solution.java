package com.list._83;

import com.basic.ListNode;

/**
 * Created by Ai Lun on 2020-01-02.
 */

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
