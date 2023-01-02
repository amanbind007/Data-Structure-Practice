import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {

        for(int i = 0; i< nums.length/2; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-i-1];
            nums[nums.length-i-1] = temp;
        }

        for(int i = 0; i<Math.abs(k/2); i++){
            int temp = nums[i];
            nums[i] = nums[k-1-i];
            nums[k-1-i] = temp;

        }

        int j = 0;
        for(int i=k; i<k+(nums.length-k)/2; i++){
            int temp = nums[i];
            nums[i] = nums[k+(nums.length-k)/2-j];
            nums[k+(nums.length-k)/2-j] = temp;
            j++;

        }
        
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr, 3);

        System.out.println(Arrays.toString(arr));
    }
    
}
