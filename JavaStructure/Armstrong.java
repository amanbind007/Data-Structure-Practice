import java.lang.Math;
public class Armstrong {
    public static boolean isArmstrong(int num) {
        int temp = num;
        int temp2 = num; 
        int sum = 0;
        int count = 0;
        int r;
        while(temp2 != 0){
            temp2 /= 10;
            count++;
        }
        System.out.println(count);
        while(temp != 0){
            r = temp%10;
            sum += Math.pow(r, count);
            temp /= 10;
        }
        System.out.println(sum);
        if(sum == num){
            
            return true;
        }
        else{
            return false;

        }
    }

    public static void main(String[] args) {
        System.out.println("Is it an Armstrong Number " + isArmstrong(153));
        System.out.println("Is it an Armstrong Number " + isArmstrong(1634));
        System.out.println("Is it an Armstrong Number " + isArmstrong(54748));
        System.out.println("Is it an Armstrong Number " + isArmstrong(125));
        System.out.println("Is it an Armstrong Number " + isArmstrong(125));
    }
}
