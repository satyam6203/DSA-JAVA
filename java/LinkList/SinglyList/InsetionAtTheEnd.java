import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
public class InsetionAtTheEnd {
    static void PrintList(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    static Node InsertAtEnd(Node head,int val){
        Node temp=new Node(val);
        if(head == null){
            return temp;
        }
        Node curr=head;
        while(curr.next != null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
    public static void main(String[] args) {
        Node head=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size :");
        int n =sc.nextInt();
        System.out.println("enter the value of the linkList:");
        for(int i =0;i<n;i++){
            int val=sc.nextInt();
            head= InsertAtEnd(head, val);
        }
        sc.close();
        PrintList(head);
    }
}
