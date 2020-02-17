package com.list;

import com.basic.ListNode;

/**
 * Created by Ai Lun on 2020-01-01.
 */

public class _206 {

    ListNode reverseRecursion(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nextTemp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextTemp;
        }
        return prev;
    }
}
