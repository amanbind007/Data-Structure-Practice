package JavaCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.ArrayList;

public class Remove_objects_from_HashSet {
    public static void main(String[] args) {

        // remove () method Remove an element from a HashSet.
        // removeAll () method - Remove all the elements that exist in a given collection from the HashSet.
        // clear () method Clear the HashSet completely by removing all the elements.

        Set<String> st  = new HashSet<String>();
        st.add("Chana");
        st.add("Thuli");
        st.add("Mung Dal");
        st.add("Shakkar");
        st.add("Dalda Ghee");
        st.add("Masur Dal");
        st.add("Chawal");
        st.add("Mishri");
        st.add("Kaccha Chana");
        st.add("Chana");
        st.add("Parmal");
        st.add("Aanta");
        st.add("Besan");
        st.add("Chironji");
        st.add("Besan");
        st.add("Gud");

        System.out.println(st);
        st.remove("Gud");
        System.out.println(st);

        Collection<String> str = new ArrayList<>();
        str.add("Thuli");
        str.add("Masur Dal");
        str.add("Chana");
        str.add("Gud");
        st.removeAll(str);
        System.out.println(st);
        st.clear();
        System.out.println(st);

    }
    
}
