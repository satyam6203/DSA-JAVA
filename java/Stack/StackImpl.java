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
            System.out.println("stack is overflow");
            return;
        }
        top++;
        arr[top]=val;
    }
    int pop(){
        if(top==-1){
            System.out.println("stack is underflow");
            return -1;
        }
        return arr[top--];
    }
    void display(){
        if(top==-1){
            System.out.println("stack is underflow");
            return;
        }
        for(int i =top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    int search(int key){
        for(int i=top;i>=0;i--){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
public class StackImpl{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack s=new Stack(n);
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            s.push(val);
        }
        s.display();
        System.out.println();
        System.out.println(s.pop());
        s.display();
        int key=sc.nextInt();
        int res=s.search(key);
        if(res!=-1){
            System.out.println("element found at the index "+res);
        }
        else{
            System.out.println("element is not present");
        }
    }
}