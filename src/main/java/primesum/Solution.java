package primesum;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    static class Couple {
        int x;
        int y;

        public Couple(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

    public static ArrayList<Integer> primesum(int value) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Couple> couples = new ArrayList<>();
        for (int x = 0; x < value; x++) {
            if (isPrime(x)) {
                int y = value - x;
                if (isPrime(y)) {
                    if (!couples.isEmpty()) {
                        int a = couples.get(0).x;
                        int b = couples.get(0).y;
                        if (a < x || a == x && b < y) {
                            continue;
                        }
                    }
                    couples.clear();
                    couples.add(new Couple(x, y));
                }
            }
        }
        result.add(couples.get(0).x);
        result.add(couples.get(0).y);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(primesum(10));
    }
}
