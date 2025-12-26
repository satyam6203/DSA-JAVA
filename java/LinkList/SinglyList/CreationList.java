class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
public class CreationList{
    static void PrintList(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(40);
        head.next=temp1;
        temp1.next=temp2;
        PrintList(head);
    }
}