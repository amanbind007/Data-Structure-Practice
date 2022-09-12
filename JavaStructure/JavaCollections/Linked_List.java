package JavaCollections;

import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Aman");
        ll.add("Sindu");
        ll.add("Rakesh");
        ll.add("Mukesh");
        ll.add("Abhinav");
        ll.add("Neeraj");

        System.out.println(ll);

        ll.add("Zunaid");

        System.out.println(ll);

        ll.add(5, "Maheed");

        System.out.println(ll);

        ll.addFirst("Nadeem");

        System.out.println(ll);

        ll.addLast("Deepak");

        System.out.println(ll);

        //First Element
        System.out.println(ll.getFirst());

        //Last Element
        System.out.println(ll.getLast());

        //Get Element at index
        System.out.println(ll.get(5));

        //to get class of object
        System.out.println(ll.getClass());


        //iterate over objects using for loop
        for(String str : ll){
            System.out.print(str+" ");
        }

        System.out.println();

        //iterate over objects using lambda
        ll.forEach((element) -> System.out.print(element+" "));

        System.out.println();

    


        //How to remove the first element in the LinkedList.    
        ll.removeFirst();
        System.out.println(ll);

        //How to remove the last element in the LinkedList.
        ll.removeLast();
        System.out.println(ll);

        //How to remove the element at agiven index in the LinkedList.
        ll.remove(5);
        System.out.println(ll);

        //removes head of the linked list
        ll.remove();
        System.out.println(ll);

        ll.add("Rakesh");
        ll.add("Mukesh");
        System.out.println("After inserting copies "+ ll);
        ll.remove("Rakesh");
        System.out.println(ll);
        ll.removeFirstOccurrence("Mukesh");
        System.out.println(ll);

        //How to remove element from the LinkedList if certain criteria is met.
        ll.removeIf((element) -> element.length() < 6);
        System.out.println(ll);

        //remove all elements from the linked list
        ll.clear();
        System.out.println(ll);

    }

}
