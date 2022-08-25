public class Factorial {
    public static int factorial(int num) {

        int i, 
        fact = 1;
        for (i = 1; i <= num; i++) {
            fact = fact * i;

        }
        return fact;

    }
    public static int factorialUsingRec(int num) {
        if(num == 0){
            return 1;
        }
        else{
            return (num*factorialUsingRec(num-1));
        }
    }


    public static void main(String[] args) {
        System.out.println("Factorial is " + factorial(15));

        System.out.println("Factorial is " + factorialUsingRec(15));
    }
}
