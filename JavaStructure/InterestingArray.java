import java.util.Scanner;

public class InterestingArray {

    public static int binarySearch(int[] arr, int num){
        int low = 0;
        int high = arr.length;
        int mid;
        while(low<high){
            mid = (low+high)/2;
            if(arr[mid] == num){
                return mid;
            }
            else if(arr[mid]<num){
                low = mid-1;
            }
            else{
                high = mid-1;
            }

        }
        return -1;
    }




    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){

            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] =  sc.nextInt();
            }

            int targetSum = sc.nextInt();

            for(int i = 0; i<n; i++){
                int temp = arr[i]-targetSum;
                int index = binarySearch(arr, temp);
                if(index == -1){
                    System.out.println("-1");
                }
                if(arr[i]+arr[temp]==targetSum){
                    System.out.println(i+" "+ temp);
                }
            }

            t--;
        }
    }
    
}
