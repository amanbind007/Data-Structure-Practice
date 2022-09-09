package JavaCollections;

import java.util.List;
import java.util.ArrayList;

public class Access_objects_in_ArrayList {
    public static void main(String[] args) {
        // How to check if an ArrayList is empty using the isEmpty method.
        // How to find the size of an ArrayList using the size () method.
        // How to access the element at particular index in an ArrayList using the get () method.
        // How to modify the element at a particular index in an ArrayList using the set () method.

        List<String> lst = new ArrayList<String>();
        System.out.println("Is List Empty " + lst.isEmpty());

        lst.add("Aman");
        lst.add("Sindu");
        lst.add("Rakesh");
        lst.add("Mukesh");
        lst.add("Abhinav");
        lst.add("Neeraj");

        System.out.println("Content of List : "+ lst);

        System.out.println("Size of List is "+ lst.size());

        String str = "";
        for(int i = 0; i<lst.size(); i++){
            str += lst.get(i) + " -> ";
        }
        System.out.println(str);

        for(int i=0; i<lst.size(); i++){
            lst.set(i, "Aman Bind");
        }

        System.out.println("Content of List : "+ lst);
        System.out.println("Is List Empty  " +lst.isEmpty());


    }
    
}
