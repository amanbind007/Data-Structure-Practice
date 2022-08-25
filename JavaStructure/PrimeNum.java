public class PrimeNum {
    public static boolean isPrime(int n) {
        int count = 0;
        if (n == 1) {
            return false;
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (i == n) {
                count--;
            }
        }
        if (count >= 2) {
            return false;
        } else {
            return true;
        }

    }

    public static void primeForQuantity(int quantity) {
        int found = 0;
        int i = 2;
        while (found < quantity) {
            // int i = 1;
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (j == i) {
                    count--;
                }

            }
            if (count < 2) {
                System.out.print(" " + i);
                found++;
            }
            i++;

        }

    }

    public static void primeForRange(int range) {

        for (int i = 2; i <= range; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (i == j) {
                    count--;
                }
            }
            if (count < 2) {
                System.out.print(" " + i);
            }

        }

    }

    public static void main(String[] args) {

        System.out.println("\n============================================================");
        System.out.print("Is it a prime number : " + isPrime(447796));

        System.out.println("\n============================================================");
        primeForQuantity(20);

        System.out.println("\n============================================================");
        primeForRange(71);
        
        System.out.println("\n============================================================");
    }

}
