package leetcode.Amazon.easy;

import leetcode.Amazon.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * ReverseLinkedList
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);

        System.out.println(reverseList(l1));
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }


}