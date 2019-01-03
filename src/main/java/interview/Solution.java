package interview;

// Boris-Wilfried
// Fcbk glider coding test
public class Solution {

    public static int maximumTemperature(int[] temperatures) {
        int maxTemperature = 0;

        // Write the code to solve the problem belowra
        int size = temperatures.length;
        maxTemperature = temperatures[1] - temperatures[0];
        int min_element = temperatures[0];
        for (int i = 1; i < size; i++)
        {
            if (temperatures[i] - min_element > maxTemperature){
                maxTemperature = temperatures[i] - min_element;
            }
            if (temperatures[i] < min_element){
                min_element = temperatures[i];
            }
        }
        // Return the maximum temperature for the given set of temperatures
        return maxTemperature;
    }

    public static void main(String[] args) {
        //int[] temp = {23,55,67,22,40,65,44,20};
        int[] temp = {10,20,30,40,50};
        System.out.println(maximumTemperature(temp));
    }
}
