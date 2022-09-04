import java.util.ArrayList;

import javax.xml.crypto.Data;

public class LargestSumOfSubArray {

    public static int kadanes(int[] arr, int n) {
        int best_sum = 0;
        int current_sum = 0;
        for (int i = 0; i < n; i++) {
            current_sum += arr[i];
            if (current_sum < 0) {
                current_sum = 0;
            }
            if (current_sum > best_sum) {
                best_sum = current_sum;
            }
        }
        return best_sum;
    }

    public static int MAX(ArrayList<Integer> dArr){
        int max = 0;
        int size = dArr.size();
        for(int i =0; i< size; i++){
            if(max<=dArr.get(i)){
                max = dArr.get(i);
            }
        }
        return max;
    }

    public static int noob_approach(int arr[], int n) {

        ArrayList<Integer> dArr = new ArrayList<Integer>();


        for(int i=0; i< n; i++){
            int current_sum = 0;
            for(int j = i; j<n; j++){
                current_sum+=arr[j];
                dArr.add(current_sum);
            }
        }
        int max = MAX(dArr);
        return max;

    }

    public static void main(String[] args) {
        int arr[] = { -4, 6, 8, -4, 6, 7, 1, 3, -9, 5 };
        int n = arr.length;

        int largest = kadanes(arr, n);

        System.out.println(largest);
        int xlargest = noob_approach(arr, n);

        System.out.println(xlargest);

    }

}
