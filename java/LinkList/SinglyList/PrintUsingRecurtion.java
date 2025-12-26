class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
public class PrintUsingRecurtion {//we can traverse the linkList using the Recurtion
    static void PrintList(Node head){
        Node temp=head;
        if(temp == null){
            return;
        }
        System.out.print(head.data+" -> ");
        PrintList(head.next);
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
