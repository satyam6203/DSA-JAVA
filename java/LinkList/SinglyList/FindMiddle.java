import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
public class FindMiddle {
    static void PrintList(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    static void PrintMiddle(Node head){
        if(head == null) return;
        int count=0;
        Node temp;
        for(temp=head;temp != null;temp=temp.next){
            count++;
        }
        System.out.println("number of the element in the list:"+count);
        temp=head;
        for(int i =0;i<count/2;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    static void EfficientSol(Node head){
        if(head == null) return;
        Node fast=head,slow=head;
        while(fast.next != null && slow != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
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
        sc.close();
        PrintList(head);
        PrintMiddle(head);
        EfficientSol(head);
    }
}
