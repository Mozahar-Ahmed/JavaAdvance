package math.problems;

public class FindMissingNumber {
    /*
     * If n = 10, then array will have 9 elements in the range from 1 to 10.
     * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
     * Write java code to find the missing number from the array. Write static helper method to find it.
     */
    static int helper(int a[], int n)
    {
        int i;
        int total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= a[i];

        return total;
    }
    public static void main(String[] args) {
        int a[] = { 10, 2, 1, 4, 5, 3, 7, 8, 6 };
        int missing = helper(a, 9);
        System.out.println("The missing number in this given array is: "+ missing);

    }
}
