
import java.util.Scanner;

public class multipleOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        String str = "";
        for(int i=0; i<n; i++){
            if(arr[i]%3==0){
                count++;
                str = str+Integer.toString(i+1)+ " ";


            }
        }
        if(count==0){
            System.out.println("Nothing here!");
        }
        else{
            System.out.println(count);
            System.out.println(str);
        }
        sc.close();
    }
    
}
