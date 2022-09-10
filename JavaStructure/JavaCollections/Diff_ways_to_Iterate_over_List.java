package JavaCollections;

import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class Diff_ways_to_Iterate_over_List {
    public static void main(String[] args) {

        List<String> lst = Arrays.asList("Aman", "Sindu", "Rakesh", "Mukesh", "Abhinav", "Neeraj");
        System.out.println(lst);

        //Using for loop
        for(int i= 0; i<lst.size(); i++){
            System.out.print(lst.get(i)+ " ");
        }
        System.out.println();

        //Using while loop
        int i = 0;
        while(i<lst.size()){
            System.out.print(lst.get(i)+ " ");
            i++;
        }
        System.out.println();

        //enhanced for loop
        for(String str : lst){
            System.out.print(str+" ");
        }
        System.out.println();

        //for loop with iterator
        for(Iterator<String> iterator = lst.iterator(); iterator.hasNext();){
            String str = iterator.next();
            System.out.print(str+" ");
        }
        System.out.println();

        //while loop with Iterator
        Iterator<String> iterator = lst.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.print(str+" ");
        }
        System.out.println();

        //Stream + Lambda
        lst.stream().forEach((elements)-> System.out.print(elements+" "));
        System.out.println();

        //forEach and Lambda
        lst.forEach((elements)-> System.out.print(elements+" "));


    }
}
