package JavaCollections;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Create_HashSet_from_Collections {
    public static void main(String[] args) {
        Collection<String> lst = new ArrayList<>();
        lst.add("Chana");
        lst.add("Thuli");
        lst.add("Mung Dal");
        lst.add("Shakkar");
        lst.add("Dalda Ghee");
        lst.add("Masur Dal");
        lst.add("Chawal");
        lst.add("Mishri");
        lst.add("Kaccha Chana");
        lst.add("Chana");
        lst.add("Parmal");
        lst.add("Aanta");
        lst.add("Besan");
        lst.add("Chironji");
        lst.add("Besan");
        lst.add("Gud");

        Set<String> set = new HashSet<>(lst);

        System.out.println(set);
        

    }
    
}
