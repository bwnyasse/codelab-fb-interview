package leetcode.Amazon.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * LongestSubstringWithoutRepeatingCharacters
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {

        LinkedList<Character> fifo = new LinkedList<>();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (fifo.contains(s.charAt(i))) {
                res = Math.max(res, fifo.size());
                Character toRemove;
                do {
                    toRemove = fifo.remove();
                } while (toRemove != s.charAt(i));
                fifo.add(s.charAt(i));
            }else{
                fifo.add(s.charAt(i));
            }
        }

        return Math.max(res, fifo.size());
    }
}