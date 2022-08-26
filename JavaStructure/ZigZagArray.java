import java.util.Scanner;

public class ZigZagArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        System.out.println(" Enter Matrix: ");
        int arr[][] = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            if(i%2==0){
                for(int j=0; j<N; j++){
                    System.out.print(arr[j][i]+ " ");
                }
            }
            else{
                for(int j=N-1; j>=0;  j--){
                    System.out.print(arr[j][i]+ " ");
                }
            }
        }
        sc.close();
        System.exit(0);

    }
    
}
