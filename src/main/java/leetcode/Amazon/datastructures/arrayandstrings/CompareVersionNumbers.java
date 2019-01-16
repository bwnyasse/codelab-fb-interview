package leetcode.Amazon.datastructures.arrayandstrings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CompareVersionNumbers
 */
public class CompareVersionNumbers {

    public static void main(String[] args) {
        System.out.println(compareVersion("1.0.1","1"));
    }

    public static int compareVersion(String version1, String version2) {
        
        String[] listVersion1 = version1.split("\\.");
        String[] listVersion2 = version2.split("\\.");

        int maxSize = Math.max(listVersion1.length, listVersion2.length);

        for (int i = 0; i < maxSize; i++) {

            int value1 = i < listVersion1.length ? Integer.valueOf(listVersion1[i]) : 0;
            int value2 = i < listVersion2.length ? Integer.valueOf(listVersion2[i]) : 0;

            if (value1 > value2) {
                return 1;
            } else if (value1 < value2) {
                return -1;
            } 

        }

        return 0;
    }
}