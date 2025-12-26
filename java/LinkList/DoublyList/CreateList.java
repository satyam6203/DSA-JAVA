class Node{
    int data;
    Node prev;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
        this.prev=null;
    }
}
public class CreateList{
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
    }
}