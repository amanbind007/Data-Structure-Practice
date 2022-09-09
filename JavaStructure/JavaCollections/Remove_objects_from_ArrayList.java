package JavaCollections;

import java.util.List;
import java.util.ArrayList;



public class Remove_objects_from_ArrayList {
    public static void main(String[] args) {

        // remove() -> by object
        // remove() -> by index
        // removeAll()
        // clear()


        List<String> lst = new ArrayList<>();
        lst.add("Aman");
        lst.add("Sindu");
        lst.add("Rakesh");
        lst.add("Mukesh");
        lst.add("Abhinav");
        lst.add("Neeraj");

        System.out.println("Contents of List "+ lst);

        lst.remove("Mukesh");

        System.out.println("Contents of List "+ lst);

        lst.remove(1);

        System.out.println("Contents of List "+ lst);

        List<String> newLst = new ArrayList<>();
        newLst.add("Abhinav");
        newLst.add("Neeraj");

        lst.removeAll(newLst);

        System.out.println("Contents of List "+ lst);

        lst.clear();

        System.out.println("Contents of List "+ lst);
        
    }
    
}
