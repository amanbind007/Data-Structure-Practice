import java.util.Scanner;

// Input
// The first line of input will contain the integer f, 1<=f<=1,000,000.
// Each of the following flines will be of the form a b, where a and b are different player IDs. This indicates that player #a is friends with player #b,
// and vice versa. All player IDs are integers between 0 and 1000 inclusive.
// (Note that no friendship will ever be listed twice: for example, if "2 5" is one of the lines in the input, then neither "2 5" nor "5 2" will appear
// anywhere else in the input.)
// 
// Output
// Output should consist of all the player IDs that are tied for biggest friendlist. These IDs should be given in ascending order.
// Join @getstudyfever Telegram
// 
// Sample Input
// 6
// 5 6
// 0 1
// 1 4
// 5 4
// 1 2
// 4 0

// Sample Output 
// 1
// 4


public class prog {
    public static void main(String[] args) {
        int arr[] = new int[1001];
        for (int i = 0; i < 1001; i++) {
            arr[i] = 0;
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a]++;
            arr[b]++;
        }
        int max = 0;
        //int count = 0;
        for (int i = 0; i < 1001; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < 1001; i++) {
            if(arr[i] == max){
                System.out.println(i);
            }
        }

        sc.close();
    }

}
