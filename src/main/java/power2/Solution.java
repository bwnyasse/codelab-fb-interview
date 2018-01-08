package power2;

import java.util.ArrayList;

public class Solution {

    public static boolean isPower(int value) {
        if(value == 1) return true;
        for(int base=0; base <value ;base++){
            int power = (int)(Math.log(value)/Math.log(base));
            if(Math.pow(base,power) == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPower(8));
    }
}
