package remduplnk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

    class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }

    public ListNode deleteDuplicates(ListNode list) {
        ListNode start = list;
        while(list.next != null){
            int current = list.val;
            int nextValue = list.next.val;
            if(current == nextValue){
                list.next = list.next.next;
                continue;
            }
            list = list.next;
        }

        return start;
    }


}
