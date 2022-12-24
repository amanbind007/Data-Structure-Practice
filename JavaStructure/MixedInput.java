import java.util.Scanner;

// Mixed Input
// You are given three inputs, first an integer number, second a float number, and third a character. You have to print all the inputs in a single line separated by a dollar sign($).
// Note:- Output order must be the same as the input order. Note:- In float number, only two digits you have to print after the decimal.
// Example:-
// Input:- 1 2.1 a
// Output:- 1$2.10$a 
// Input Format
// The first line contains three input NN, MM and chch where NN is an integer number, MM is a float number and chch is a character.
// Output Format
// You have to print the all inputs separated by a dollar sign($).
// Constraints
// 0<=N,M<=1000 <= N,M <= 100 a<=ch<=za <= ch <= z
// Time Limit
// 1 second
// Example
// Sample Input
// 4 2.01 a
// Sample Output
// 4$2.01$a



public class MixedInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        float flt = Float.parseFloat(sc.next());
        String str = sc.next();
        System.out.printf("%d$%.2f$%s",num,flt,str);
    }
}
