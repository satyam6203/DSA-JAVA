import java.util.Scanner;

public class OddEven{
    static void Method1(int n){
        while(n<0){
            n=-n;
        }
        while(n>1){
            n=n-2;
        }
        if(n==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
    static void Method2(int n){
        if(n<0){
            n=-n;
        }
        if(n==(n/2)*2){
            System.out.println("number is even");
        }
        else{
            System.out.println("odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Method1(n);
        Method2(n);
    }
}