package JavaCollections;

import java.util.ArrayList;
import java.util.List;


public class Java_List{
    public static void main(String[] args) {
        List<String> lst = new ArrayList<String>();;


        // List allow duplicate elements
        lst.add("Aman");
        lst.add("Aman");
        lst.add("Bind");
        lst.add("Bind");
        System.out.println(lst);

        // List allow null elements
        lst.add(null);
        System.out.println(lst);
        
        // list maintains insertion order
        lst.add("Element 1");
        lst.add("Element 2");
        lst.add("Element 3");
        lst.add("Element 4");
        System.out.println(lst);


        // Accessing Elements in list
        System.out.println("Element at 0 " + lst.get(0));
        System.out.println("Element at 3 " + lst.get(3));
        System.out.println("Element at 6 " + lst.get(6));

        

    }
}