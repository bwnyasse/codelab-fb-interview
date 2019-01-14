package leetcode.Amazon.datastructures.arrayandstrings;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * FirstUniqueChar
 */
public class FirstUniqueChar {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> values = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            values.put(s.charAt(i),values.getOrDefault(s.charAt(i),0) + 1);
        }

        for(int i = 0; i< s.length();i++){
            if(values.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }


}