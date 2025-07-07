import java.util.Scanner;
class Swap{
    void Numebr(int[] arr){
        int temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
    }
}
public class SwapNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the both number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.println("value bofore the swap:");
        System.out.println("A->"+a);
        System.out.println("B->"+b);
        int[] arr={a,b};
        Swap s=new Swap();
        s.Numebr(arr);
        a=arr[0];
        b=arr[1];
        System.out.println("Value after the swap:");
        System.out.println("A->"+a);
        System.out.println("B->"+b);
    }
}
