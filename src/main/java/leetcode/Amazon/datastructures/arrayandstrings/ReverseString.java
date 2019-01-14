package leetcode.Amazon.datastructures.arrayandstrings;

import java.util.Stack;

/**
 * ReverseString
 */
public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("A man, a plan, a canal: Panama"));
        
    }

    public static String reverseString(String s) {

        StringBuilder res = new StringBuilder();
        for(int i=s.length()-1; i >= 0 ;i--) {
            res.append(s.charAt(i));
        }

        return res.toString();
    }
}