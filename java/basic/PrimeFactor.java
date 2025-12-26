import java.util.Scanner;

public class PrimeFactor {
    static boolean isPrime(int n){
        if(n <= 1)return false;
        for(int i =2;i*i<=n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    static void primeFactor(int n){
        for(int i =2;i<=n;i++){
            if(isPrime(i)){
                while(n % i==0){
                    System.out.print(i+" ");
                    n=n/i;
                }
            }
        }
    }

    static void primeFactor2(int n){
        if(n <=1)return;
        for(int i =2;i<=n;i++){
            while(n % i==0){
                System.out.print(i+" ");
                n=n/i;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n=sc.nextInt();
        System.out.println("your prime factor is :");
        primeFactor(n);
        System.out.printf("\n");
        primeFactor2(n);
    }
}
