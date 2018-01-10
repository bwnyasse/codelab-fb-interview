package wave;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public static ArrayList<Integer> wave(ArrayList<Integer> list) {
        ArrayList<Integer> waveList = new ArrayList<>();
        Collections.sort(list);

        for(int i=0;i<list.size();i=i+2){
            if(i+1 < list.size()){
                if (list.get(i) < list.get(i+1)) {
                    waveList.add(list.get(i+1));
                    waveList.add(list.get(i));
                }else{
                    waveList.add(list.get(i+1));
                    waveList.add(list.get(i));
                }
            }else{
                waveList.add(list.get(i));
            }

        }
        return waveList;
    }

    public static void main(String[] args) {
        System.out.println(wave(new ArrayList<Integer>(Arrays.asList(1, 2, 3,4,5))));
    }
}
