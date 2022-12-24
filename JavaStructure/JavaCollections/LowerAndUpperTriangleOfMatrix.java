package JavaCollections;

import java.util.Scanner;

// Lower and Upper Triangular Matrices
// You are given an M∗N matrix, print lower triangular matrix and upper triangular matrix. See sample test case for better understanding.
// Input format
// First line contains M and N representing rows and columns respectively. Each of the next M lines contains N integers.
// Output format
// Lower Triangular Matrix Upper Triangular Matrix
// Constraints
// 1<=M,N<=5
// Time Limit
// 1 second
// Example
// Input
// 3 3 1 2 3 4 5 6 7 8 9
// Output
// 1 0 0 4 5 0 7 8 9 1 2 3 0 5 6 0 0 9
// Sample test case explanation
// M=3M=3 and N=3N=3 Matrix = [123456789]
// Lower Triangular Matrix = [100450789]
// Upper Triangular Matrix = [123056009]




class LowerAndUpperTriangleOfMatrix{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for(int i = 0; i< m; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(j<=i){
                System.out.print(arr[i][j]+" ");
                }else{
                    System.out.print("0 ");
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(j>=i){
                System.out.print(arr[i][j]+" ");
                }else{
                    System.out.print("0 ");
                }
            }
        }
      

    }
}

