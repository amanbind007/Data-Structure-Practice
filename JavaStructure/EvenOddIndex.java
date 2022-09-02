import java.util.Scanner;

// Even and Odd Indexes

// Given an array of integers, print two integer values:
// First, the sum of all numbers which are even as well as whose index are even.
// Second, the sum of all numbers which are odd as well as whose index are odd.
// Print the two integers space separated. (Arrays is 0-indexed)
// Input:
// Given an integer denoting the size of array.
// Next line will have a line containing ‘n’ space separated integers.
// Constraints:
// 1<=n<=10^5
// 1 <= Ai <= 10^6 
// Output:
// Two space separated integers denoting even and odd sums respectively.
// Sample Input:
// 5
// 2 3 5 1 4
// Sample Output:
// 6 4

public class EvenOddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (arr[i] % 2 == 0) {
                    evenSum += arr[i];
                }
            } else {
                if (arr[i] % 2 == 1) {
                    oddSum += arr[i];
                }
            }
        }
        System.out.println(evenSum+" "+oddSum);
        sc.close();

    }
}
