public class ReverseNum {
    public static int reverse(int num) {
        int digit;
        int reverse=0;
        while(num!=0){
            digit = num%10;
            reverse = (reverse*10)+digit;
            num = num/10;
        }
        return reverse;

    }

    public static void main(String[] args) {
        int someNum = 387462834;
        System.out.println("Reverse of " + someNum +" is " + reverse(someNum));
    }
}
