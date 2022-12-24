import java.util.Scanner;

// Chef is standing at coordinate AA while Chefina is standing at coordinate BB.

// In one step, Chef can increase or decrease his coordinate by at most KK.

// Determine the minimum number of steps required by Chef to reach Chefina.

// Input Format
// The first line of input will contain a single integer TT, denoting the number of test cases.
// Each test case consists of three integers X, Y,X,Y, and KK, the initial coordinate of Chef, the initial coordinate of Chefina and the maximum number of coordinates Chef can move in one step.
// Output Format
// For each test case, output the minimum number of steps required by Chef to reach Chefina.

// Constraints
// 1 \leq T \leq 10001≤T≤1000
// 1 \leq X, Y \leq 1001≤X,Y≤100
// 1 \leq K \leq 1001≤K≤100
// Sample 1:
// Input
// Output
// 4
// 10 20 3
// 36 36 5
// 50 4 100
// 30 4 2
// 4
// 0
// 1
// 13
// Explanation:
// Test case 11: In the first three steps, Chef increases his coordinate by K = 3K=3. In the fourth step, Chef increases his coordinate by 11 which is less than equal to KK. It can be shown that this is the minimum number of steps required by Chef.

// Test case 22: Chef is already at the same coordinate as Chefina. Thus, he needs 00 steps.

// Test case 33: Chef can use 11 step to decrease his coordinate by 4646 which is less than K = 100K=100 and reach Chefina.

// Test case 44: Chef can use 1313 steps to decrease his coordinate by K = 2K=2 and reach the coordinate 30-13\cdot 2 = 430−13⋅2=4.

public class ReachFast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int K = sc.nextInt();
            if (X == Y) {
                System.out.println("0");
                continue;
            } else if ((X - Y) < 0) {
                int count = 0;
                do {
                    count++;
                    X += K;
                } while (X < Y);
                System.out.println(count);
                continue;
            } else if ((X - Y) > 0) {
                int count = 0;
                do {
                    count++;
                    X -= K;
                } while (X > Y);
                System.out.println(count);
                continue;
            }

            t--;
        }
    }

}
