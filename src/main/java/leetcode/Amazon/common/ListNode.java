package leetcode.Amazon.common;

/**
 * ListNode
 */
public class ListNode {

        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }

        @Override
        public String toString() {
            String res = String.valueOf(val) ;
            while(next != null){
                res = res + " -> " + next.val;
                next = next.next;
            }
            return res;
        }

}
