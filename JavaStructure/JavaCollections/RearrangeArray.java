package JavaCollections;

import java.util.Arrays;
import java.util.Scanner;

// Rearrange the Array
// You are given a sorted array of positive integers. PrepBud is bored of sorted arrays and wants you to rearrange the array. The new arrangement follows an interesting pattern. In the new pattern, array elements have to be arranged alternatively i.e first element should be the maximum value present in the array, the second element should be the minimum value, the third element should be the second maximum, forth the second minimum and so. Can you write a program to rearrange the array in the new pattern?
// Input format
// First-line contains integer T, denoting the number of test cases. For each test case: First-line contains an integer N. Second line contains N space separated integers A HYPERLINK "https://www.prepbytes.com/panel/mycourses/program-one/java/week/2/arrays/codingAssignment/REARRAY" i.
// Output format
// For each test case on a new line, print the newly arranged array.
// Constraints:
// 1<=T<=10
// 1<=N<=106
//  0<=A[i]<=106
// Time Limit
// 1 second
// Example
// Input
// 1 5 1 2 3 4 5
// Output
// 5 1 4 2 3
// Sample test case explanation
// Since 5 is the maximum element so it is at first position. 1 ​is the minimum element so it is in the second position.4 ​is the second maximum element so it is in the third position. and so on.

public class RearrangeArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){

            // Taking array size
            int n = sc.nextInt();

            
            int[] arr = new int[n];

            // Taking Input
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int p = 0;
            int q = n-1;
            int[] result = new int[n];
            for(int i = 0; i<n/2; i++){
                result[2*i] = arr[q];
                q--;
                result[2*i+1] = arr[p];
                p++;

            }
            if(n%2==1){
                result[n-1] = arr[n/2]; 
            }
            System.out.println(Arrays.toString(result));




            t--;
        }
    }
    
}
