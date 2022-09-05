import java.util.*;
import java.lang.*;

// Maximum Product Subarray

// Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

// Example 1:

// Input:
// N = 5
// Arr[] = {6, -3, -10, 0, 2}
// Output: 180
// Explanation: Subarray with maximum product
// is [6, -3, -10] which gives product as 180.
// Example 2:

// Input:
// N = 6
// Arr[] = {2, 3, 4, 5, -1, 0}
// Output: 120
// Explanation: Subarray with maximum product
// is [2, 3, 4, 5] which gives product as 120.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function maxProduct() which takes the array of integers arr and n as parameters and returns an integer denoting the answer.
// Note: Use 64-bit integer data type to avoid overflow.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 ≤ N ≤ 500
// -102 ≤ Arri ≤ 102

public class Maximum_product_subarray {

    public static int maxProdSubArray(int arr[], int n) {

        int max_current_sum = 1;
        int min_current_sum = 1;
        int max_sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                int temp = min_current_sum;
                min_current_sum = Math.min(1, min_current_sum*arr[i]);
                max_current_sum  = Math.max(1, temp*arr[i]);
            }
            if (arr[i] > 0) {
                max_current_sum *= arr[i];
                min_current_sum = Math.max(1, max_current_sum);
                
            }
            if (arr[i] == 0) {
                max_current_sum = 0;
                min_current_sum = 0;
            }
            if(max_sum<max_current_sum){
                max_sum = max_current_sum;
            }
        }
        

        return max_sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = maxProdSubArray(arr, n);
        System.out.println("Max: " + max);
        sc.close();

    }

}
