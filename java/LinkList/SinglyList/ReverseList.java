import java.util.ArrayList;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
public class ReverseList {
    static void PrintList(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    static Node revreseNode(Node head){
        ArrayList<Integer> arr=new ArrayList<>();
        for(Node temp=head;temp != null;temp=temp.next){
            arr.add(temp.data);
        }
        for(Node temp=head;temp != null;temp=temp.next){
            temp.data=arr.remove(arr.size()-1);
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=null,tail=null;
        System.out.println("enter the size of the List");
        int n=sc.nextInt();
        System.out.println("enter the element of the list:");
        for(int i=0;i<n;i++){
            int val =sc.nextInt();
            Node newNode=new Node(val);
            if(head == null){
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
        revreseNode(head);
        PrintList(head);
    }
}
