package leetcode.Amazon.easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

import javax.sound.sampled.SourceDataLine;

/**
 * ValideParentheses
 */
public class ValidParentheses {

    // private static Character[] characters = { '(', ')', '{', '}', '[', ']' };

    public static void main(String[] args) {

        String sequence = "([)]";
        System.out.println(isValid(sequence));
    }

    public static boolean isValid(String sequence) {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < sequence.length(); i++) {
            System.out.println(stack);

            Character c = sequence.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
           
            boolean isValid = isValidClosed(stack.peek(), c);
            if (isValid) {
                stack.pop();
            }else{
                stack.push(c);
            }

        }
        return stack.isEmpty();
    }

    private static boolean isValidClosed(char x, char y) {
        switch (x) {
        case '(':
            return y == ')';
        case '{':
            return y == '}';
        case '[':
            return y == ']';
        default:
            return false;
        }
    }
}