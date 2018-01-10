package majority;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Solution {

    public static int majority(ArrayList<Integer> list) {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        for(Integer num : list){
            numbers.merge(num, 1, Integer::sum);
            if(numbers.get(num) > list.size() / 2){
                return num;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(majority(new ArrayList<>(Arrays.asList( 6,6,8,4,7,4,4,4,4,4,4))));
    }
}
