package leetcode.Amazon.datastructures.linkedlist;

import java.util.LinkedList;
import java.util.Stack;

import leetcode.Amazon.common.ListNode;

/**
 * IntersectionOfTwoLinkedLists
 */
public class IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(1);
        l1.next.next.next = new ListNode(2);
        l1.next.next.next.next = new ListNode(4);

        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(4);
        // l2.next.next.next = new ListNode(8);
        // l2.next.next.next.next = new ListNode(4);
        // l2.next.next.next.next.next = new ListNode(5);
        ListNode node = getIntersectionNode(l1, l2);
        System.out.println(node);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // boundary check
        if (headA == null || headB == null)
            return null;

        ListNode a = headA;
        ListNode b = headB;

        // if a & b have different len, then we will stop the loop after second
        // iteration
        while (a != b) {
            // for the end of first iteration, we just reset the pointer to the head of
            // another linkedlist
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }

}