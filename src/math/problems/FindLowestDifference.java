package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

         /*Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1*/

      // Returns minimum difference between any pair
      static int findMinDiff(int[]arr, int n)
    {
        // Sort array in non-decreasing order
        Arrays.sort(arr);

        // Initialize difference as infinite
        int diff = Integer.MAX_VALUE;

        // Find the min diff by comparing adjacent  pairs in sorted array
        for (int i=0; i<n-1; i++)
            if (arr[i+1] - arr[i] < diff)
                diff = arr[i+1] - arr[i];

        // Return min diff
        return diff;
    }


    public static void main(String[] args) {
        int arr1[] = new int[]{30, 12, 5, 9, 2, 20, 33, 1};
        int arr2[] = new int[]{30, 12, 5, 9, 2, 20, 33, 1};
        System.out.println("Minimum difference in array1 is "+ findMinDiff(arr1, arr1.length));
        System.out.println("Minimum difference in array2 is "+ findMinDiff(arr2, arr2.length));

    }

}
