package JavaCollections;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.function.Consumer;

public class JavaCollections{

    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<>();

        // Adding Data
        arr.add("Aman");
        arr.add("Kumar");
        arr.add("Bind");
        arr.add("Anjali");
        arr.add("Bind");
        System.out.println(arr);

        // Removing Data
        arr.remove("Bind");
        System.out.println(arr);

        // Checking whether data is in Collection
        System.out.println(arr.contains("Aman"));
        System.out.println(arr.contains("Sanu"));

        // Cheking Size of the Collection i.e., Total elements
        System.out.println(arr.size());

        // ForEach Working
        arr.forEach((elements)-> {
            System.out.println(elements);
        });

        System.out.println(arr.toString() + " ^%&");
        arr.clear();
        System.out.println("Empty -> "+ arr);



        
    }
}