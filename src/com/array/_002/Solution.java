package com.array._002;

import com.basic.ListNode;

/**
 * Created by Ai Lun on 2019-06-28.
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode sum = head;
        int add = 0;

        while (l1 != null || l2 != null || add != 0) {
            int v = add;
            if (l1 != null) {
                v += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                v += l2.val;
                l2 = l2.next;
            }
            add = v / 10;
            v = v % 10;
            sum.next = new ListNode(v);
            sum = sum.next;
        }
        return head.next;
    }

}
