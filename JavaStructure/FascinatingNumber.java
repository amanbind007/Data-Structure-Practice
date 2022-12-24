import java.util.HashSet;
import java.util.Scanner;

import javax.print.attribute.HashDocAttributeSet;

// Fascinating Number
// PrepBuddy find any four digit number fascinating that has all the 4 digits unique. For example 1234 is a fascinating number. His friend Rahul gave him N numbers and asks him to find the minimum number which is strictly larger than the given one and has only distinct digits.
// Input format
// The first line of the input contains integer N, denoting the count of numbers provided by Rahul. Each of the next N lines contains one integer.
// Output format
// Print the next fascinating number.
// Constraints
// 1<=N<=10
// 1000<=number<=9000
// Time Limit
// 1 ​secon
// Example
// Input
// 2 1234 2010
// Output
// 1235 2013
// Sample test case explanation
// 1235 ​is the minimum number that is larger than 1234￼ with all 4￼ digits 1,2,3,5￼ distinct

public class FascinatingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            boolean flag = true;
            while (flag) {
                n += 1;
                HashSet<Integer> hs = new HashSet<Integer>();
                int temp = n;
                int count = 0;
                while (temp > 0) {
                    int r = temp % 10;

                    if (hs.contains(r)) {
                        continue;
                    } else {
                        hs.add(r);
                        count++;
                    }
                    temp /= 10;
                    if (count == 4) {
                        System.out.println(n);
                        flag = false;

                    }

                }
                
                break;
            }

            t--;
        }

    }

}
