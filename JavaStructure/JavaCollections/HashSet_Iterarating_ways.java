package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSet_Iterarating_ways {
    public static void main(String[] args) {
        Set<String> courses = new HashSet<String>();
        courses.add("Java");
        courses.add("C");
        courses.add("C++");
        courses.add("Python");
        courses.add("Scala");
        // Enhanced for loop
        for(String str : courses){
            System.out.print(str+ " ");
        }
        System.out.println();


        // Basic loop with iterator
        for(Iterator<String> iter = courses.iterator(); iter.hasNext();){
            System.out.print(iter.next()+" ");
        }
        System.out.println();


        // While loop with iterator
        Iterator<String> iter = courses.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+ " ");
        }
        System.out.println();


        // JDK 8 forEach() method with lambda
        courses.forEach((element) -> System.out.print(element+" "));
        System.out.println();

        // JDK 8 streaming + forEach() + lambda expression
        courses.stream().forEach((element) -> System.out.print(element+" "));
        System.out.println();


    }
}
