import java.util.Scanner;

class Sum{
    int Number(int n){
        if(n==0){
            return 0;
        }
        return n+Number(n-1);
    }
}
public class SumOfNatutal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Sum s=new Sum();
        System.out.println(s.Number(n));
    }
}
