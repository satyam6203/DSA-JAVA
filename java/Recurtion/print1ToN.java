import java.util.Scanner;
class Print1tN{
    void print(int n){
        if(n<=0){
            return;
        }
        print(n-1);
        System.out.println(n+" ");
    }
}
public class print1ToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Print1tN pt=new Print1tN();
        pt.print(n);
    }
}
