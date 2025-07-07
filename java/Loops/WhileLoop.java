import java.util.Scanner;

public class WhileLoop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        sc.close();
        int n=1;
        while(n<=num){
            System.out.println(n);
            n++;
        }
    }
}