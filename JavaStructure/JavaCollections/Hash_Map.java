package JavaCollections;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;



public class Hash_Map {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        

        //Putting values in Hash Map
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
        mp.put(null, 13);
        mp.put(null, 12);
        mp.put("Shasank", 10);
        mp.put("Trisha", 11);
        mp.put("Kashish", 12);

        

        System.out.println(mp);

        mp.ke


        //getting values from Hash Map
        System.out.println(mp.get("Aman Bind"));

        //Checking whether Hash Map is Empty
        System.out.println("Is mp Empty: "+ mp.isEmpty());

        //Checking whether Hash Map Contains that 'Key'
        System.out.println("Does mp contains key 'Deepak' : "+mp.containsKey("Deepak"));
        System.out.println("Does mp contains key 'Deepa' : "+mp.containsKey("Deepa"));

        //Cheking whether Hash Map Contains that 'Value'
        System.out.println("Does mp contains value 11 : "+mp.containsValue(11));
        System.out.println("Does mp contains value 17 : "+mp.containsValue(17));

        //Storing values of Hash Map in Collection
        Collection<Integer> cont = mp.values();
        System.out.println(cont);

        //Storing Keys of Hash Map in Set
        Set<String> st = mp.keySet();
        System.out.println(st);


        //Cheking Size of Hash Map
        System.out.println("Size of MP is : " + mp.size());

        //Removing key-value from Hash Map
        mp.remove("Kartik");
        System.out.println(mp);

        //Replacing value of a key
        mp.replace("Aman", 50);
        System.out.println(mp);

        //Replacing value of key if its current value matches
        mp.replace("Aman", 1, 100);
        System.out.println(mp);

        

        /* ----------------------------------------------------
         * 
         * Different Ways to Iterate over Hash Map
         * 
         ---------------------------------------------------- */

         
         System.out.println();

         mp.forEach((k,v) -> System.out.print(k+"-"+v+", "));

       
    }
}
