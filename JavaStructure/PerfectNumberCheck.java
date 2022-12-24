import java.util.Scanner;

// Perfect Number and Divisors
// Have you heard of Perfect numbers? If not let me tell you what is it, Perfect Numbers are integers that are equal to the sum of all its divisors except that number itself. Now, given an integer N,write a program to print true if it is a perfect number or false if it is not a perfect number.
// Input format
// The first line contains the number of test cases T. Each test case contains an integer N is provided.
// Output format
// For each test case on a new line, print true or false depending on N.
// Constraints
// 1<=T<=10
// 1<=N<=100
// Time Limit
// 1 ​secon
// Example
// Input
// 2 28 96
// Output
// true false


public class PerfectNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){

            int n = sc.nextInt();

            int sum = 0;

            for(int i =1; i<n; i++){
                if(n%i==0){
                    sum+=i;
                }
            }

            if(sum==n){
                System.out.println("true");;
            }else{
                System.out.println("false");
            }

            t--;
        }
        
    }
    
}
