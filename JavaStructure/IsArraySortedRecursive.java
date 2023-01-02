public class IsArraySortedRecursive {

    public static boolean isSorted(int[] arr, int size) {
        if (size == 0 || size == 1) {
            return true;
        }
        if (arr[size - 1] < arr[size - 2]) {
            return false;
        }

        return (isSorted(arr, size - 1));

    }

    public static void main(String[] args) {

        int[] arr = { 4, 3, 5, 6, 7, 8, 9 };

        System.out.println(isSorted(arr, arr.length));

    }

}
