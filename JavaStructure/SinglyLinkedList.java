

public class SinglyLinkedList {
    public ListNode head;

    // Generic Type
    public static class ListNode<T> {
        private T data;
        private ListNode<T> next;

        public ListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode curreListNode = head;
        while (curreListNode != null) {
            System.out.print(curreListNode.data + " -> ");
            curreListNode = curreListNode.next;
        }
        System.out.print("null\n");

    }

    public int length() {
        ListNode curListNode = head;
        int len = 0;
        while (curListNode != null) {
            len++;
            curListNode = curListNode.next;
        }
        return len;
    }

    public <T> void insertAtFirst(T num) {
        ListNode newNode = new ListNode("Aman");
        newNode.next = head;
        head = newNode;
    }

    public <T> void insertAtLast(T num) {
        if(head == null){
            ListNode newNode = new ListNode("Bind");
            head = newNode;
        }
        else{
            ListNode curListNode = head;
            while(curListNode.next != null){
                curListNode = curListNode.next;
            }
            ListNode newNode = new ListNode("Bind");
            curListNode.next = newNode;
        }

    }

    public static void main(String args[]) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode<>(10);
        ListNode second = new ListNode<>(13);
        ListNode third = new ListNode<>(100);
        ListNode fourth = new ListNode<>(45);

        // connecting them to make chain
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        // structure
        // head -> 10 -> 13 -> 100 -> 45 -> null
        System.out.println("=============================");
        sll.display();

        System.out.println("=============================");
        System.out.println("Lenght of linked list is " + sll.length());

        System.out.println("=============================");
        sll.insertAtFirst("Aman");
        sll.display();

        System.out.println("=============================");
        System.out.println("NewList Empty is created");
        SinglyLinkedList newList = new SinglyLinkedList();

        System.out.println("=============================");
        newList.insertAtFirst("Aman");
        newList.display();

        System.out.println("=============================");
        sll.insertAtLast("Bind");
        sll.display();

        System.out.println("=============================");
        System.out.println("NewList Empty is created");
        SinglyLinkedList newNewList = new SinglyLinkedList();


        System.out.println("=============================");
        newNewList.insertAtLast("Bind");
        newNewList.display();

        System.out.println("=============================");

    }

}