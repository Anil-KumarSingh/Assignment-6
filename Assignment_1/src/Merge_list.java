//Merge to sorted list using recursion
class node{
    int data;
    node next;
    node(int x){
        data=x;
        next=null;
    }
}
public class Merge_list{
    static Node sortedMerge(Node head1,Node head2){
        //base cases
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;

        //recursive merging based on smaller value
        if(head1.data<=head2.data){
            head1.next = sortedMerge(head1,head2);
            return head1;
        }
        else{
            head2.next = sortedMerge(head1, head2.next);
            return head2;
        }
    }
     static void printlist(Node curr){
        while(curr!=null){
            System.out.print("->");
            curr=curr.next;
        }
        System.out.println();
     }
    public static void main(String[] args){
        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);
         Node head2= new Node(2);
         head2.next=new Node(3);
         head2.next.next=new Node(20);

         Node res = sortedMerge(head1,head2);
         printlist(res);
    }
}
