import java.util.Scanner;


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

    public static int maxProduct(int[] nums) {
        
        int n = nums.length;
        int current_max = 1;
        int current_min = 1;
        int maxx = 0;
        for(int i = 0; i<n; i++){
            if(nums[i]>0){
                current_max *= nums[i];
                current_min = Math.min(1, current_min*nums[i]);
            }
            else if(nums[i]==0){
                current_min = 1;
                current_max = 1;
            }
            else{
                int temp = current_max;
                current_max = Math.max(1, current_min*nums[i]);
                current_min = temp*nums[i];
            }
            maxx = Math.max(current_max,maxx);
        }
        return maxx;
             
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = maxProduct(arr);
        System.out.println("Max: " + max);
        sc.close();

    }

}
