import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

public class SoreteTheList {
    static void PrintList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    static Node SortTheList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        boolean swapped;
        do {
            swapped = false;
            Node curr = head;

            while (curr.next != null) {
                if (curr.data > curr.next.data) {
                    int temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = temp;
                    swapped = true;
                }
                curr = curr.next;
            }
        } while (swapped);
        return head;
    }

    public static void main(String[] args) {
        Node head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n = sc.nextInt();
        System.out.println("enter the element of the list:");
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
        PrintList(head);
        SortTheList(head);
        PrintList(head);
    }
}
