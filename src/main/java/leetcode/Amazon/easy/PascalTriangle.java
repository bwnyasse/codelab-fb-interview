package leetcode.Amazon.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * PascalTriangle
 */
public class PascalTriangle {

    public static void main(String[] args) {
        System.out.println(getRow(4));
    }


    public static List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<Integer>();
     
        if (rowIndex < 0)
            return result;
     
        result.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            System.out.println("i=" +i);
            for (int j = result.size() - 2; j >= 0; j--) {
                System.out.println("j="+j);
                result.set(j + 1, result.get(j) + result.get(j + 1));
            }
            result.add(1);
        }
        return result;
    }
}