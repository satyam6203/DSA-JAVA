import java.util.Scanner;
import java.util.Stack;
public class UsingColl {
    static void findMin(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        int min = stack.peek();
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i) < min) {
                min = stack.get(i);
            }
        }
        System.out.println("Smallest element is: " + min);
    }
        
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of stack");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            stack.push(val);
        }
        System.out.println("stack elements are:");
        for(int i=stack.size()-1;i>=0;i--){
            System.out.print(stack.get(i)+" ");
        }
        System.out.println();
        System.out.println("element popped is:"+stack.pop());
        System.out.println("smallest element is");
        int min=stack.get(0);
        findMin(stack);
        System.out.println(min);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        findMin(stack);
    }
}
