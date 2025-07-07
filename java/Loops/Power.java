import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter the number:");
        int a=sc.nextInt(),b=sc.nextInt();
        int ans=1;
        sc.close();
        for(int i=0;i<b;i++){
            ans *= a;
        }
        System.out.println(ans);
    }
}
