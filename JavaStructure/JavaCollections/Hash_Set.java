
package JavaCollections;
import java.util.Set;
import java.util.HashSet;


public class Hash_Set {
    public static void main(String[] args) {

        // create a HashSet using the HashSet () constructor
        // add new elements to it using the add() method.

        Set<String> st = new HashSet<String>();
        
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

        System.out.println("Hash Set " + st);
        
        System.out.println(st.contains("Gud"));
        System.out.println(st.contains("Chai Patti"));

        
            
    }
    
}
