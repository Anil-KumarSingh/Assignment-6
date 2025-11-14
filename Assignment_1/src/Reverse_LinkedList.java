//Reverse  linked list using recursion
class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class Reverse_LinkedList {
    //Function to reverse the Linked list
    static Node reverseList(Node head){
        if(head==null || head.next==null)
            return head;
        //reverse rest of the list
        Node revHead=reverseList(head.next);

        //make current head the last node
        head.next.next=head;

        //update the next of current head to Null
        head.next=null;

        //return the new head
        return revHead;
    }
    static void printList(Node curr){
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        head = reverseList(head);
        printList(head);
    }
}
