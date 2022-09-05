import java.util.Scanner;

// Mindbending Product

// You are given an array ‘ARR’ of size N. You have to construct a Product Array ‘P’ of the same size such that P[i] is equal to the product of all the elements of ARR except ARR[i]. The constraint is that you are not allowed to use the division operator.

// For Example:

// For an array {1, 2, 3, 4, 5}:
// The required product array generated from the given array is {120, 60, 40, 30, 24 }

// This can be generated in the following manner:

// For generating 120 we have 2 * 3 * 4 * 5 i.e. the product of other array elements except 1.
// For generating 60 we have 1 * 3 * 4 * 5  i.e. the product of other array elements except 2.
// For generating 40 we have 1 * 2 * 4 * 5  i.e. the product of other array elements except 3.
// For generating 30 we have 1 * 2 * 3 * 5  i.e. the product of other array elements except 4.
// For generating 24 we have 1 * 2 * 3 * 4  i.e. the product of other array elements except 5.
// Input Format:
// The first line contains an Integer 'T' which denotes the number of test cases/queries to be run. 
// Then the test cases follow. 

// The first line of input for each test case/query contains an integer N representing the size of the array.

// The second line of input for each test case/query contains N space-separated integers representing the elements of the array.
// Output Format:
// For each test case, print 'N' single space-separated integers denoting elements of the product array P.

// Output for every test case will be printed in a separate line.
// Note:
// 1. You do not need to print anything, it has already been taken care of. Just implement the function.
// 2. The value of P[i] will fit into a 64-bit data type.
// Constraints:
// 1 <= T <= 50
// 1 <= N <= 10
// 1 <= ARR [i] <= 20

// Time Limit: 1 sec

// 2
// 5
// 10 3 5 6 2
// 2
// 12 20
// Sample Output 1:
// 180 600 360 300 900
// 20 12
// Explanation:
// Test Case 1: 
// For the product array P,
// At i=0 we have 3*5*6*2 = 180.
// At i=1 we have 10*5*6*2 = 600. 
// At i=2 we have 10*3*6*2 = 360. 
// At i=3 we have 10*3*5*2 = 300. 
// At i=4 we have 10*3*5*6 = 900
// So, the P array is 180 600 360 300 900

// Test Case 2: 
// For the product array P, 
// At i=0, we have 20. 
// At i=1, we have 12.
// So, the P array is 20 12. 

public class Mindbending_Product {



    public static void main(String[] args) {
        
        
    }
}



//Solution 2
// class Solution {
    
//     public int maxiMaxx(int[] arr, int start,int stop){
//         int n = arr.length;
//         int sum = 1;
//         for(int i=start; i<=stop; i++){
//             sum*=arr[i];
//         }
//         return sum;
//     }
//     public int[] productExceptSelf(int[] nums) {
    
//         int n = nums.length;
//         int P[] =  new int[n];
//             for(int i=0; i<n; i++){
//                 if(i==0){
//                     P[i]=maxiMaxx(nums, 1, n-1);
//                 }
//                 else if(i==n-1){
//                     P[i]=maxiMaxx(nums, 0, n-2);
//                 }
//                 else{
//                     P[i]= maxiMaxx(nums,0, i-1)*maxiMaxx(nums, i+1,n-1);
//                 }
//             }
//         return P;
//     }
// }