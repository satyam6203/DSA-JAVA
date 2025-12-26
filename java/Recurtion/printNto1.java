import java.util.Scanner;

class Print1N{
     int print(int n){
        if(n<=1){
            return 1;
        }
        System.out.println(n);
        return print(n-1);
    }
}
public class printNto1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Print1N n1=new Print1N();
        System.out.println(n1.print(n));
    }
}
