import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
public class InsertAtPosition {
    static void PrintList(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    static Node InnsetPos(Node head,int val,int pos){
        Node temp=new Node(val);
        if(pos == 1){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        for(int i =1;i<pos-2 && curr != null;i++){
            curr=curr.next;
        }
        if(curr == null){
            return head;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
    public static void main(String[] args) {
        Node head=null,tail=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size :");
        int n =sc.nextInt();
        System.out.println("enter the value of the linkList:");
        for(int i =0;i<n;i++){
            int val=sc.nextInt();
            Node newNode=new Node(val);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        sc.close();

        PrintList(head);
        head=InnsetPos(head,15,1);
        PrintList(head);
    }
}
