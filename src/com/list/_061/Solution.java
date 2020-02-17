package com.list._061;

import com.basic.ListNode;

/**
 * Created by songliang on 2020/1/19.
 */
public class Solution {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        int len = getListLength(head);
        k = k % len;
        if (k == 0) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        int cnt = 0;
        while(fast.next != null) {
            if (cnt >= k) {
                slow = slow.next;
            }
            fast = fast.next;
            cnt++;
        }
        ListNode newHead = slow.next;
        fast.next = head;
        slow.next = null;
        return newHead;
    }

    public int getListLength(ListNode head) {
        int n = 0;
        while (head != null) {
            head = head.next;
            n++;
        }
        return n;
    }

}
