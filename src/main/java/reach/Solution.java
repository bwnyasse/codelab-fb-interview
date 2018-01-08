package reach;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int numSteps = 0;
        if (X.size() != Y.size())
            return 0;
        for (int i = 1; i < X.size(); i++){
            numSteps += Math.max(Math.abs(X.get(i) - X.get(i-1)), Math.abs(Y.get(i) - Y.get(i-1)));
        }
        return Math.abs(numSteps);
    }

    public static void main(String[] args) {
        System.out.println(coverPoints(new ArrayList<Integer>(Arrays.asList(0,1,1)),new ArrayList<Integer>(Arrays.asList(0,1,2))));
    }
}
