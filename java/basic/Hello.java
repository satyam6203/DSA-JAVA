import java.util.Scanner;

class fibo{
    static int Recurtionfibo(int n){
        if(n<= 1){
            return n;
        }
        return Recurtionfibo(n-1)+ Recurtionfibo(n-2);
    }
    static void ManualFibo(int n){
        int first=0,second=1;
        for(int i =1;i<=n;i++){
            System.out.println(first+" ");
            int result = first + second;
            first=second;
            second=result;
        }
        System.out.println();
    }
}
public class Hello{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(fibo.Recurtionfibo(n));
        System.out.println("By recursive:");
        for(int i =0;i<n;i++){
            System.out.println(fibo.Recurtionfibo(i));
        }
        System.out.println("By manual:");
        fibo.ManualFibo(n);
    }
}