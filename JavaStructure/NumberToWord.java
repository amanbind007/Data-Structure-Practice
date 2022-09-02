
import java.util.Arrays;
import java.util.Scanner;

//Number to Word

public class NumberToWord {

    public static String upto2(char arr[]) {
        String[] onesDigit = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] twosDigit = { "", "eleven", "twelve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };
        String[] t_s = { "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty" };
        // String[] multiplier = { "hundred", "thousand" };

        int len = arr.length;
        if (len == 0) {
            return null;
        }
        if (len == 1) {
            int num = Integer.parseInt(Character.toString(arr[len - 1]));
            return onesDigit[num];
        }
        if (len == 2 && arr[0] == '1' && arr[len - 1] != '0') {
            int num = Integer.parseInt(Character.toString(arr[len - 1]));
            return twosDigit[num];
        }
        if (len == 2 && arr[len - 1] == '0') {
            int num = Integer.parseInt(Character.toString(arr[0]));
            return t_s[num - 1];
        }
        if (len == 2 && arr[0] != '1') {
            int fnum = Integer.parseInt(Character.toString(arr[0]));
            int snum = Integer.parseInt(Character.toString(arr[len - 1]));
            return t_s[fnum - 1] + " " + onesDigit[snum];
        }
        return null;

    }

    public static String numToWord(char arr[]) {
        String[] onesDigit = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] twosDigit = { "", "eleven", "twelve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };
        String[] t_s = { "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty" };
        // String[] multiplier = { "hundred", "thousand" };

        int len = arr.length;
        if (len == 0) {
            return null;
        }
        if (len == 1) {
            int num = Integer.parseInt(Character.toString(arr[len - 1]));
            return onesDigit[num];
        }
        if (len == 2 && arr[0] == '1' && arr[len - 1] != '0') {
            int num = Integer.parseInt(Character.toString(arr[len - 1]));
            return twosDigit[num];
        }
        if (len == 2 && arr[len - 1] == '0') {
            int num = Integer.parseInt(Character.toString(arr[0]));
            return t_s[num - 1];
        }
        if (len == 2 && arr[0] != '1') {
            int fnum = Integer.parseInt(Character.toString(arr[0]));
            int snum = Integer.parseInt(Character.toString(arr[len - 1]));
            return t_s[fnum - 1] + " " + onesDigit[snum];
        }
        if (len < 3) {
            upto2(arr);
        }
        if (len == 3) {
            // char newarr[] = arr;
            int fnum = Integer.parseInt(Character.toString(arr[0]));
            return onesDigit[fnum] + " hundred " + upto2(Arrays.copyOfRange(arr, 1, 3));
        }

        return "hello";
    }

    public static void main(String[] args) {
        char arr[];
        Scanner sc = new Scanner(System.in);
        arr = sc.nextLine().toCharArray();
        System.out.print(numToWord(arr));
        sc.close();

    }

}