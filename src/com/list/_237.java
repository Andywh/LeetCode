package com.list;

import com.basic.ListNode;

import java.util.List;

/**
 * Created by Ai Lun on 2020-01-01.
 */
public class _237 {

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode cur = head;
        cur.next = new ListNode(5);
        cur =  cur.next;
        ListNode toDelete = cur;
        cur.next = new ListNode(1);
        cur =  cur.next;
        cur.next = new ListNode(9);
        cur =  cur.next;

        deleteNode(toDelete);
        System.out.println("123");

    }


}
