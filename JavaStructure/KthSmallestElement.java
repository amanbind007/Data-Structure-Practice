
import java.util.*;

class Solution {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int n = 10;
        int arr[] = { 7, 10, 4, 20, 15, 5, 45, 9, 23 };
        int k = 4;

        int ans = kthSmallest(arr, n, n, k);
        System.out.println(ans);

    }

}