package CoreJAVA;



class Test {

    public static int power(int x, int n) {
        if (n == 1) {
            return x;
        } else {
            return x * power(x, n - 1);
        }
    }

    public static void numPrint(int n) {
        if (n == 0) {
            return;
        }
        numPrint(n - 1);
        System.out.println(n);

    }

    public static int numCount(int n) {
        if(n==0){
            return 0;
        }
        if (n / 10 == 0) {
            return 1;
        } else {
            return 1 + numCount(n / 10);
        }
    }

    public static int nFibonacciNum(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else{
            return nFibonacciNum(n-1)+nFibonacciNum(n-2);
        }

    }

    public static boolean isSorted(int[] arr, int size){
        if(size== 0 || size==1){
            return true;
        }
        if(arr[size-1]<arr[size-2]){
            return false;
        }

        return (isSorted(arr, size-1));

    }

    public static int sum(int[] arr, int n){
        if(n==0){
            return 0;
        }
        int sum = arr[n-1] + sum(arr, n-1);
        return sum;
    }

    public static boolean contains(int[] arr, int num, int sizeOfArr){
        if(sizeOfArr == 0){
            return false;
        }
        
        if(arr[sizeOfArr-1] == num){
            return true;
        }

        
    }

    public static void main(String[] args) {

        int[] arr = {-1, -3, -5};

        System.out.println(sum(arr, arr.length));

    }
}
