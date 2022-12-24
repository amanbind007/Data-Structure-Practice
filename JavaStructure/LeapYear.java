import java.util.Scanner;

// Leap Year or Not
// We all have made fun of our friends who have their birthdays on 29th29th February. Given birthday year NN of your friend, can you tell her if that is leap year or not? 
// Input format
// The first line constains an integer TT denoting the number of test cases. Each test case contains one integer NN.
// Output format
// For each test case on a new line, print Yes if the given year is a leap year else print No.
// Constraints
// 1<=T<=10 1<=N<=2500
// Time Limit
// 11 ​secon
// Example
// Input
// 2 1900 2012
// Output
// No Yes


//

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
         
        while(t>0){
            int year = sc.nextInt();
            if((year%4 == 0 && year%100!=0) || year%400==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

            t--;
        }

        
        sc.close();

        
    }
    
}
