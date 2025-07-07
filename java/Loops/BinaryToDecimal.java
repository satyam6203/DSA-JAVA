import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number:");
        int n=sc.nextInt();
        sc.close();
        int ans=0;
        int num=1;
        while(n>0){
            int unit_digit=n%10;
            ans += (unit_digit*num);
            n /=10;
            num *=2;
        }
        System.out.println("ans:"+ans);
    }
}
