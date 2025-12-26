import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int val){
        this.data=val;
        this.next=null;
    }
}
public class FindThePosition {
    static void PrintTheList(Node head){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    static int findPos(Node head,int key){
        int pos=1;
        Node temp=head;
        while (temp != null) {
            if(temp.data == key){
                return pos;
            }
            else{
                pos++;
                temp=temp.next;
            }
        }
        return -1;
    }
    static int recursiveFind(Node head,int key){
        if(head == null) return -1;
        if(head.data == key){
            return 1;
        }
        else{
            int res=recursiveFind(head.next, key);
            if(res == -1) return -1;
            else return (res+1);
        }
    }
    public static void main(String[] args) {
        Node head=null,tail=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of N:");
        int n=sc.nextInt();
        System.out.println("Enter the element of List:");
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
        PrintTheList(head);
        int key=sc.nextInt();
        // int res=findPos(head, key);
        sc.close();
        int res=recursiveFind(head, key);
        if(res != -1){ 
            System.out.println("position :-> "+res);
        }
        else{
            System.out.println("Not found in the List");
        }
    }
}
