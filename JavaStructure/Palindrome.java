class Palindrome {

    public static boolean isPalindrome(int n) {
        int temp = n;
        int sum = 0;
        int r;
        while(temp!=0){
            r = temp%10;
            sum = (sum*10)+r;
            temp /= 10;
        }
        if(sum == n){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String args[]) {
        System.out.println("Is it a Palindrome Number "+ isPalindrome(123421));
        System.out.println("Is it a Palindrome Number "+ isPalindrome(1234321));
    }
}