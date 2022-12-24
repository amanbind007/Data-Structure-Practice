package JavaCollections;

import java.util.HashMap;
import java.util.Map;


public class Hash_Map_User_Defined_Object {
    public static void main(String[] args) {

        Map<Integer, Student> mp = new HashMap<>();
        mp.put(1, new Student("Aman", "Bind"));
        mp.put(1, new Student("Anjali", "Bind"));
        mp.put(1, new Student("Ashwani", "Bind"));
        mp.put(1, new Student("Abhishek", "Bind"));

        System.out.println(mp.toString());

    }

}