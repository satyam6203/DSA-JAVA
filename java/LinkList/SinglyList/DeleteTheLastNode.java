import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
public class DeleteTheLastNode {
    static void PrintVal(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    static Node DeleteTail(Node head){
        if(head == null) return null;
        if(head.next == null) return null;
        Node temp=head;
        while(temp.next.next != null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of N:");
        int n=sc.nextInt();
        Node head = null, tail = null;
        System.out.println("enter the element of the List:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        sc.close();
        PrintVal(head);
        head=DeleteTail(head);
        PrintVal(head);
    }
}
