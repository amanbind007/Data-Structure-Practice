import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Queue;
import java.util.PriorityQueue;
import java.lang.Math;
import java.util.Collections;
import java.util.Arrays;

// https://www.codechef.com/problems/COOK82C

// Hussain is very bored, and has a lot of exams lined up next week. But he doesn't want to study. 
// As usual, he decided to fail his exams and play with Hasan instead (who has already failed). 
// Hussain invented this new game to play with Hasan.

// Hussain shows Hasan a multiset of integers. (A multiset is a collection of elements where there can be duplicates).
// In every move Hussain removes a maximum number from this multiset and divides it by 2 
// (integer division, which is rounded down).

// If after dividing, the number is still positive (greater than 0) he re-inserts it back into the multiset.

// Before the start of the game, Hussain shows Hasan the numbers in his multiset.

// Hussain asks Hasan, M questions. The i-th question will be denoted by Q[i], 
// and Hasan must find the value of the number Hussain will be dividing (before he performs the division) 
// after Q[i]-1 moves. That is, what is the value of the number on which the Q[i]-th division is performed?

// Can you help Hasan and answer the queries?

// Input
// The first line contains 2 space separated integers N, M denoting the initial size of the multiset and the number 
// of questions respectively.
// The next line contains N space separated integers, the initial elements of the multiset.
// Of the next M lines, the i-th line will contain Q[i].
// Output
// Output M lines, the i-th of which contains the answer for the i-th query.
// Constraints
// 1 ≤ N, M ≤ 10^6
// The queries are given in chronological order. That is, Q[i] > Q[i-1]
// Every element of the multiset will be a positive integer less than 263
// It's guaranteed that the set will contain at least one element at the time of any query.

// Sample 1:
//   ┌-----------------┬-----------------┐
//   |  Input          |   Output        |
//   ├-----------------┼-----------------┤
//   |  4 6            |    8            |
//   |  8 5 3 1        |    5            |                  
//   |  1              |    4            |
//   |  2              |    3            |
//   |  3              |    2            |
//   |  4              |    1            |          
//   |  6              |                 |
//   |  8              |                 |
//   └-----------------┴-----------------┘

// Explanation:
// We show the multiset sorted at each step, for convenience.

// Before any move, the multiset is (8, 5, 3, 1).

// In the first move, 8 is removed, dived by 2, and thus becomes 4, and then re-inserted. So, 
// the multiset, after the first move is (5, 4, 3, 1).

// In the second move, 5 is removed and after division, it become 2, which is re-inserted.
// The multiset becomes (4, 3, 2, 1).

// After the third move, the multiset becomes (3, 2, 2, 1).
// After the fourth move, it becomes (2, 2, 1, 1).
// After the fifth move, it becomes (2, 1, 1, 1).
// After the sixth move, it becomes (1, 1, 1, 1).

// In the seventh move, 1 is removed, and on division, it no longer is greater than 0. 
// Hence, it is not re-inserted. So, after the seventh move, the multiset becomes (1, 1, 1).

// After the eight move, the multiset becomes (1, 1).
// The value being divided on the first move is 8. Hence the first output is 8.

// The value being divided on the first move is 5. Hence the first output is 5.

// The value being divided on the eight move is 1. Hence the last output is 1.

// public class Hussains_set {

//     public static int calc(int qi, int[] numSet){
//         Queue<Integer> que = new PriorityQueue<>();
//         for(int i = 0; i< qi; i++){
//             if(que.peek() > numSet[numSet.length]){
//                 int n = que.poll()/2;
//                 if(n != 0){
//                     que.add(n);
//                 }
//             }
//         }
//         int result = Math.max(que.peek(), Collections.max(Arrays.asList(numSet)));
//         return result;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int M = sc.nextInt();

//         int[] numSet = new int[N];
//         Arrays.sort(numSet);

//         for (int i = 0; i < N; i++) {
//             numSet[i] = sc.nextInt();
//         }

//         for (int i = 0; i < M; i++) {
//             int Qi = sc.nextInt();
//             int result = calc(Qi, numSet);
//             System.out.println(result);
//         }
//         sc.close();
//     }

// }