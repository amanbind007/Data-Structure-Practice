import java.util.Scanner;

// Input format
// The first line of the input contains integer 
// N
// , denoting the count of boxes.
// Each of the next 
// N
//  lines contains two integers 
// t
// i
//  and 
// c
// i
//  denoting the number of toys present in the 
// i
// t
// h
//  box and the maximum capacity of that box.

// Output format
// Print the maximum number of boxes that fulfill the conditions.

// Constraints
// 1
// ≤
// N
// ≤
// 100

// 0
// ≤
// t
// i
// ,
// c
// i
// ≤
// 100

// Time Limit
// 1
//  second

// Example
// Input
// 4
// 1 2
// 2 4
// 5 6
// 6 10

// Output
// 2


public class BoxesAndToys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        while(N>0){
            int Ti = sc.nextInt();
            int Ci = sc.nextInt();

            if(Ti+2>=Ci){
                count++;
            }

            N--;
        }
        System.out.println(count);
        
    }
    
}
