
// Power

// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
// Do this recursively.
// Input format :
// Two longegers x and n (separated by space)
// Output Format :
// x^n (i.e. x raise to the power n)
// Constralongs :
// 1 <= x <= 30
// 0 <= n <= 30
// Sample Input 1 :
// 3 4
// Sample Output 1 :
// 81
// Sample Input 2 :
// 2 5
// Sample Output 2 :
// 32


import java.util.Scanner;

public class XRaisedToNUsingRecursion{

    public static long power(long X, long N){
        if(N==0){
            return 1;
        }
        long smallerProb = X*power(X, N-1);
        return smallerProb;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long N = sc.nextLong();
        long result = power(X, N);
        System.out.println(result);
        sc.close();
    }

    
}