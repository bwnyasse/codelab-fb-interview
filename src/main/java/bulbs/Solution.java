package bulbs;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static int bulbs(ArrayList<Integer> list) {
        int state = 0;
        int switches = 0;
        for(int i=0; i<list.size(); i++){
            if(state == list.get(i)){
                state = 1 - state;
                switches++;
            }
        }
        return switches;
    }

    public static void main(String[] args) {
        System.out.println(bulbs(new ArrayList(Arrays.asList(1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1))));
    }
}
