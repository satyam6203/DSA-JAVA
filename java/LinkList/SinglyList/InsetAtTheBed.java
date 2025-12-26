class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
public class InsetAtTheBed {
    static Node insertAtTheBeg(Node head,int val){
        Node temp=new Node(val);
        temp.next=head;
        return temp;
    }
    static void PrintList(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Node head= null;
        head=insertAtTheBeg(head, 10);
        head=insertAtTheBeg(head, 20);
        head=insertAtTheBeg(head, 30);
        head=insertAtTheBeg(head, 40);
        PrintList(head);
    }
}
