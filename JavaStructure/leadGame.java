import java.util.Scanner;

// Code Chef Problem (The Lead Game)
// Link -> https://www.codechef.com/problems/TLG

public class leadGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max1 = 0;
        int max2 = 0;
        int cs1 = 0;
        int cs2 = 0;
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
            cs1 = cs1+=arr1[i];
            cs2 = cs2+=arr2[i];
            if (max1 < cs1 - cs2) {
                max1 = (cs1 - cs2);
            }
            if (max2 < cs2 - cs1) {
                max2 = cs2 - cs1;
            }
        }
        if (max1 > max2) {
            System.out.println("1 " + max1);
        } else {
            System.out.println("2 " + max2);
        }
        sc.close();
    }
}