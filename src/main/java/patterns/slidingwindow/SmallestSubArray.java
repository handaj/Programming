package patterns.slidingwindow;

/**
 *  Given an array of positive numbers and a positive number ‘S’,
 *  find the length of the smallest contiguous subarray
 *  whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.
 *
 * Example 1:
 *
 * Input: [2, 1, 5, 2, 3, 2], S=7
 * Output: 2
 * Explanation: The smallest subarray with a sum great than or equal to '7' is [5, 2].
 */
public class SmallestSubArray {

    public static void main(String[] args) {
        int[] arr = {2,1,5,2,3,2};
        System.out.println("min = " + subArray(arr, 7));


        System.out.println("min = " + subArray(new int[]{8,2,1,6}, 7));

        System.out.println(subArray(new int[]{2, 1, 5, 2, 8}, 7));
        System.out.println(subArray(new int[]{3, 4, 1, 1, 6}, 8));
    }
    // Each element is travered atmost twice
    // So, complexity is O(N)
    static int subArray(int[] arr, int k) {
        int left = 0;
        int right = 0;

        int sum = 0;
        int min = Integer.MAX_VALUE;

        while (right < arr.length) {
            sum += arr[right];
            while(sum >= k) {
                min = Math.min(min, right - left + 1);
                sum -= arr[left];
                left++;
            }
            right++;
        }
        return min;
    }
}
