package JavaCollections;

import java.util.LinkedList;
import java.util.Iterator;

public class Linked_List_Search_Iteration {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Chana");
        ll.add("Thuli");
        ll.add("Mung Dal");
        ll.add("Shakkar");
        ll.add("Dalda Ghee");
        ll.add("Masur Dal");
        ll.add("Chawal");
        ll.add("Mishri");
        ll.add("Kaccha Chana");
        ll.add("Chana");
        ll.add("Parmal");
        ll.add("Aanta");
        ll.add("Besan");
        ll.add("Chironji");
        ll.add("Besan");
        ll.add("Gud");

        //Find the index of the first occurrence of an element in the LinkedList
        int index_of_First_Besan = ll.indexOf("Besan");
        System.out.println("Index of Besan is "+ index_of_First_Besan);

        // Find the index of the last occurrence of an element in the LinkedList
        int index_of_Last_Besan = ll.lastIndexOf("Besan");
        System.out.println("Last Index of Besan is "+ index_of_Last_Besan);

        
        for(Iterator<String> iter = ll.iterator(); iter.hasNext();){
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        for (String string : ll) {
            System.out.print(string+ " ");
        }
        System.out.println();
        
        ll.forEach((element)-> System.out.print(element+" "));
        System.out.println();

        for(int i=0; i<ll.size(); i++){
            System.out.print(ll.get(i)+" ");
        }


    }
    
}
