import java.util.Scanner;

public class PowerOfNumber {
    static int power(int x,int n){
        int res=1;
        for(int i =1;i<=n;i++){
            res=x*i;
        }
        return res;
    }
    static int power2(int x,int n){
        if(n==0){
            return 1;
        }
        int temp=power(x, n/2);
        temp=temp*temp;
        if(n%2==0){
            return temp;
        }
        else{
            return temp*x;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(power(a,b));
    }
}
