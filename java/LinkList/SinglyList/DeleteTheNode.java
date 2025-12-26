import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
public class DeleteTheNode {
    static void PrintTheList(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    static Node deleteHead(Node head){
        if(head == null){
            return null;
        }
        return head.next;
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
        PrintTheList(head);
        head=deleteHead(head);
        PrintTheList(head);
    }
}
