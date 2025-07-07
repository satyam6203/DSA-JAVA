import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number:");
        int num=sc.nextInt();
        sc.close();
        int ans=0;
        while(num>0){
            ans=ans*10+num%10;
            num=num/10;
        }
        System.out.println(ans);
    }
}
