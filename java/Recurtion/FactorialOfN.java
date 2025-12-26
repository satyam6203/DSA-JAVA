import java.util.Scanner;

public class FactorialOfN {
    static int factoOfN(int n){
        if(n <=1){
            return 1;
        }
        return n*factoOfN(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any numebr:");
        int n=sc.nextInt();
        int res=factoOfN(n);
        sc.close();
        System.out.println("factorial is :->"+res);
    }
}
