package interview;

public class Solution2 {

    /* The function assumes that there are at least two
       elements in array.
       The function returns a negative value if the array is
       sorted in decreasing order.
       Returns 0 if elements are equal  */
    public static int maxDiff(int arr[])
    {
        int size = arr.length;
        int max_diff = arr[1] - arr[0];
        int min_element = arr[0];
        int i;
        for (i = 1; i < size; i++)
        {
            if (arr[i] - min_element > max_diff)
                max_diff = arr[i] - min_element;
            if (arr[i] < min_element)
                min_element = arr[i];
        }
        return max_diff;
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        int[] arr = {23,55,67,22,40,65,44,20};
        //int[] arr = {10,20,30,40,50};
        System.out.println("MaximumDifference is " +
                maxDiff(arr));
    }
}