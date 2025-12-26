import java.util.Scanner;

class Stack{
    int n;
    int arr[];
    Stack(int n){
        this.n=n;
        this.arr=new int[n];
    }
    int top=-1;
    void push(int val){
        if(top==n-1){
            System.out.println("Stack is full");
            return;
        }
        top++;
        System.out.println((arr[top]=val)+" is pushed in stack");
    }
    void pop(){
        if(top==-1){
            System.out.println("EMPTY STACK");
            return;
        }
        System.out.println(arr[top--]+" is poped from stack");
    }
    void display(){
        System.out.println("Stack elements ");
        for(int i=top-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
public class OptionStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack s=new Stack(n);
        do{
            switch (n) {
                case 1:
                    int val=sc.nextInt();
                    s.push(val);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.println("EXIT....");
                    break;
                default:
                    System.out.println("invalied input");
            }
        }
        while(n!=4);
        sc.close();
    }
}
