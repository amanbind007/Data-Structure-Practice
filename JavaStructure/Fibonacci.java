import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        int i = 0, j = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        int range = sc.nextInt();

        System.out.print("0 " );
        for (int k = 0; k < range - 1; k++) {
            System.out.print(j + " ");
            int temp  = j;
            j = i+j;
            i = temp;
        }

        sc.close();

    }
}