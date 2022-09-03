import java.util.Scanner;

public class FibonacciUsingRecrsion {

    public static void fiboPrinter(int n1, int n2, int range){
        
        if(n2 < range){
            System.out.print(n2+ " ");
            fiboPrinter(n2, n2+n1, range);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+ " ");
        fiboPrinter(n1, n2,  range);

        sc.close();
    
    }
}
