import java.util.Scanner;


public class FavouriteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>=0){
            int n = sc.nextInt();
            int remainder;
            int count = 0;
            while(n>0){
                remainder = n%10;
                if(remainder == 5){
                    count++;
                }
                n= n/10;

            }
            System.out.println(count);
            t--;
        }
        sc.close();

    }
    
}
