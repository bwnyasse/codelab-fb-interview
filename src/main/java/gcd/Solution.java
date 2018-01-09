package gcd;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static int gcd(int n, int m) {
        int min = n < m ? n : m;
        if(min ==0) return Math.max(n,m);
        int gcd = 1;
        for(int i=1;i <= min ; i++){
            if ( n % i == 0 && m % i == 0){
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(gcd(2,0));
    }
}
