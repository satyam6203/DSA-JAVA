import java.util.Scanner;

class SwapEle{
    void num(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A->"+a);
        System.out.println("B->"+b);
    }
}
public class SwapBySub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        System.out.println("value before the swap:");
        System.out.println("A->"+a);
        System.out.println("B->"+b);
        System.out.println("Value after the swap:");
        SwapEle sw=new SwapEle();
        sw.num(a, b);
    }
}
