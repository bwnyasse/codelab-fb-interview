package revbits;

public class Solution {

    public static long reverseM(long value) {
        long b = 0;
        long bit = 0;
        for (int i = 0; i < 32; i++) {
            bit = (1<<i & value)>>i;
            b |= bit * (long) Math.pow(2, 32 - i - 1);
        }
        return b;
    }


    public static void main(String[] args) {
        System.out.println(reverseM(2));
    }
}
