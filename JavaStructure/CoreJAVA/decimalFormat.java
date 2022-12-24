package CoreJAVA;

import java.util.Scanner;



public class decimalFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dd =  Double.parseDouble(sc.next());
        System.out.printf("%.2f", dd);
    }
    
}
