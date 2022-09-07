package JavaCollections;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        // Initial Capacity = 10
        List<String> arrList = new ArrayList<String>();
        arrList.add("Aman Bind");
        arrList.add("Anjali Bind");
        arrList.add("Abhishek Bind");
        arrList.add("Ashwani Bind");

        System.out.println(arrList);

        List<String> first_five_prime_num = new ArrayList<>();
        first_five_prime_num.add("2");
        first_five_prime_num.add("3");
        first_five_prime_num.add("5");
        first_five_prime_num.add("7");
        first_five_prime_num.add("11");

        System.out.println("First " + first_five_prime_num);

        List<String> newList = new ArrayList<>(first_five_prime_num);

        System.out.println("Second " + newList);

        List<String> next_five_prime_num = new ArrayList<>();
        next_five_prime_num.add("13");
        next_five_prime_num.add("17");
        next_five_prime_num.add("19");
        next_five_prime_num.add("23");
        next_five_prime_num.add("29");

        newList.addAll(next_five_prime_num);

        System.out.println("Third " + newList);

    }

}
