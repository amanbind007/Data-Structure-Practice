import java.util.Scanner;

// House Number
// Rahul is living in a colony containing N houses. He needs to label each house with a number from 1 to N. Each house will be labelled with a distinct number. Rahul wants to know how many digits he will have to write down as he labels the houses.
// Input format
// The first line of the input contains integer T, denoting the number of test cases. Each of the next T lines contains one integer denoting the value of N.
// Output format
// Print the number of digits needed to number all the houses.
// Constraints
// 1<=T<=23
// 1<=N<=109

// Time Limit
// 1 ​secon
// Example
// Input
// 2 12 10
// Output
// 15 11
// Sample test case explanation
// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 For first test case total digits =15 For second test case total digits =11.




public class HouseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int count = 0;

            for(int i =1; i<=n; i++){
                int x = i;
                while(x>0){
                    count++;
                    x/=10;
                }
            }
            System.out.println(count);



            t--;
        }
        
    }
}
