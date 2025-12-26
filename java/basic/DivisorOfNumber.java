import java.util.Scanner;

public class DivisorOfNumber {
    static void divisor(int n){
        for(int i =1;i<n;i++){
            if(n%i==0){
                System.out.print(i+",");
            }
        }
    }
    static void divisor1(int n){
        for(int i =1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+",");
                if(i!=n/i){
                    System.out.print(n/i+",");
                }
            }
        }
    }
    static void divisor2(int n){
        for(int i =1;i*i<n;i++){
            if(n%i==0){
                System.out.print(i+",");
            }
        }
        for(int i=n;i>=1;i--){
            if(n%i==0){
                System.out.print(n/i+",");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        divisor2(n);
    }
}
