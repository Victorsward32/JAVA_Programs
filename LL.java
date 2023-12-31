// Linked list ( Singly linked list its unidirection(1--->2--->n))

import java.util.List;

public class LL {

    Node head;
    Node tail;
    class Node{
        String data;
        Node next;
        public Node(String data) {
            this.data = data;
            this.next = null;
        }

        
    }
    // add operation :- 1) first add 2) Last add
    public void add_first(String data){
        Node newNode = new Node(data);
        if(head == null ){

            head=newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }


    public void add_last(String data){

        Node lastNode= new Node(data);
        if(head == null){
            head = lastNode;
            return;

        }
        Node currnode= head;
        while (currnode.next != null) {

            currnode= currnode.next; 
        }
        currnode.next=lastNode;

    }
// Print the linked list
    public void Prntlst(){
        if(head == null)
        System.out.println("list is Empty");{

        }
        Node currnode= head;
        while (currnode != null) {
            System.out.print(currnode.data+ " -> ");
            currnode= currnode.next; 
        }
        System.out.println("null");

    }

    // Deletion:-
    // Searching
    // Size


    public static void main(String[] args) {
        
        LL list= new LL();
        list.add_first("Im");
        list.add_first("here");
        list.Prntlst();
        list.add_last("to");
        list.add_last("look you");
        list.Prntlst();


    }
    
}
