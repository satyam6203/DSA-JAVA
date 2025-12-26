import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
public class SortInsertedList {
    static void printList(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    static Node sortedInsert(Node head,int val){
        Node temp=new Node(val);
        if(head == null){
            return temp;
        }
        if(val<head.data){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        while(curr.next != null && curr.next.data<val){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
    public static void main(String[] args) {
        Node head=null,tail=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size :");
        int n=sc.nextInt();
        System.out.println("enter the element of the List:");
        for(int i =0;i<n;i++){
            int val=sc.nextInt();
            Node newNode=new Node(val);
            if(head == null){
                head = newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        printList(head);
        System.out.println("enter the key to insert:");
        int key=sc.nextInt();
        sc.close();
        sortedInsert(head, key);
        printList(head);    
    }
}
