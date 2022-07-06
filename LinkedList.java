public class LinkedList {

    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }

    public  static LinkedList insertAtBeg(LinkedList list, int data){
        Node node= new Node(data);
        if(list.head==null){
            list.head=node;
        }
        else {

            node.next = list.head;
            list.head = node;
        }
        return list;
    }

    public static int calculateLength(LinkedList list){
        int count=0;
        Node current= list.head;
        if(list.head==null)
            return 0;
        else
        {
            while(current!=null){
               count++;
               current=current.next;
            }

        }
        return count;
    }
    public static LinkedList insertAfter(LinkedList list, int pos, int data) {

        Node node = new Node(data);
        Node current = list.head;
       if(calculateLength(list)<pos)
        {
            System.out.println("lenght is less than pos...");
            System.exit(0);
        }
        for (int i = 0; i < pos-1; i++) {
            current = current.next;
        }

        Node temp= current.next;
        current.next=node;
        node.next=temp;
        return list;
    }
    public static LinkedList insertAtEnd(LinkedList list, int data){
        Node node= new Node(data);
        Node current= list.head;
        if(current==null){
            list.head=node;
        }
        else {
            while (current.next != null) {
                current = current.next;
            }
            current.next=node;
        }
        return list;
    }

    public static void printList(LinkedList list){
        Node currNode= list.head;
        System.out.println("List.....");
        while(currNode!=null){
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
    }
    public static void main(String[] args) {

        LinkedList ll= new LinkedList();
        ll=insertAtBeg(ll,5);
        ll=insertAtBeg(ll,6);
        ll=insertAtBeg(ll,7);
        ll=insertAtBeg(ll,8);
        ll=insertAtBeg(ll,9);
        ll= insertAtEnd(ll,10);

        ll= insertAfter(ll,7,11);
        printList(ll);

    }
}
