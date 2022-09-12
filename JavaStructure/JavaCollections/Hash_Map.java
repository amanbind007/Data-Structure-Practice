package JavaCollections;

import java.util.Map;
import java.util.HashMap;


public class Hash_Map {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("Aman", 1);
        mp.put("Anuj", 2);
        mp.put("Aakash", 3);
        mp.put("Deepak", 4);
        mp.put("Farhan", 5);
        mp.put("Hardik", 6);
        mp.put("Idrak", 7);
        mp.put("Ishaan", 8);
        mp.put("Sahu", 9);
        mp.put("Sanskar", 10);
        mp.put("Tilak", 11);
        mp.put("Kartik", 12);

        System.out.println(mp);

        System.out.println(mp.get("Aman Bind"));

    }
}
