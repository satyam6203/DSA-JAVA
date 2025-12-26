import java.util.Scanner;

public class GCDOrHCF {
    static int gcd(int a,int b){//this is euclied method
        while( a != b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
    static int gcd2(int a ,int b){
        int res=Math.min(a, b);
        while(res>0){
            if(a % res == 0 && b % res==0){
                break;
            }
            res--;
        }
        return res;
    }
    static int gcd3(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd3(b,a%b);  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int gc=gcd(a, b);
        System.out.println("GCD :->"+gc);
        int gc2=gcd2(a, b);
        System.out.println("GCD :->"+gc2);
        int usingRec=gcd3(a,b);
        System.out.println("GCD :->"+usingRec);
    }
}
