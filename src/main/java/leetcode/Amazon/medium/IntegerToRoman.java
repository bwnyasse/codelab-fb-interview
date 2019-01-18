package leetcode.Amazon.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * IntegerToRoman
 */
public class IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(intToRoman(9));
    }

    public static String intToRoman(int num) {

        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"  };

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                // update num
                num -= values[i];
                // Add Symbol to use
                str.append(symbols[i]);
            }
        }

        return str.toString();
    }
}