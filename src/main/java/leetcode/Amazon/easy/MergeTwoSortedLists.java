package leetcode.Amazon.easy;

import org.omg.CosNaming.NamingContextExtHolder;

import leetcode.Amazon.common.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(-9);
        l1.next = new ListNode(-7);
        l1.next.next = new ListNode(-3);
        l1.next.next.next = new ListNode(-3);
        l1.next.next.next.next= new ListNode(-1);
        l1.next.next.next.next.next= new ListNode(2);
        l1.next.next.next.next.next.next= new ListNode(3);
        

        ListNode l2 = new ListNode(-7);
        l2.next = new ListNode(-7);
        l2.next.next = new ListNode(-6);
        l2.next.next.next = new ListNode(-6);
        l2.next.next.next.next= new ListNode(-5);
        l2.next.next.next.next.next= new ListNode(-3);
        l2.next.next.next.next.next.next= new ListNode(2);
        l2.next.next.next.next.next.next.next = new ListNode(4);

        System.out.println( mergeTwoLists(l1,l2));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // get the smallest value from both list
        if(l1 == null){
            return l2;
        } else if(l2 == null){
            return l1;
        }else if (l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }
}

