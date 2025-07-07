import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the number:");
        int n=sc.nextInt();
        sc.close();
        int num=1;
        int ans=0;
        while(n>0){
            int parity=(n%2);
            ans += (parity*num);
            num *= 10;
            n /=2;
        }
        System.out.println("ans :"+ans);
    }
}
