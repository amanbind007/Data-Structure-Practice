import java.util.Scanner;

// Number of Digits

// Given the code to find out and return the number of digits present in a number recursively. But it contains few bugs, that you need to rectify such that all the test cases should pass.
// Input Format :
// Integer n
// Output Format :
// Count of digits
// Constraints :
// 1 <= n <= 10^6
// Sample Input 1 :
// 156
// Sample Output 1 :
// 3
// Sample Input 2 :
// 7
// Sample Output 2 :
// 1

public class DigitCountUsingRecursion {

    public static int digitCouunter(int n){
        if(n/10==0){
            return 1;
        }
        int sum = 0;
        sum = digitCouunter(n/10)+1;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = digitCouunter(n);
        System.out.println(count);
        sc.close();
    }
    
}
