import java.util.Scanner;

public class CheckPrime {
    static boolean PrimeCheck(int n){
        if(n == 0) return false;
        for(int i =2;i<n;i++){
            if(n % i==0){
                return false;
            }
        }
        return true;
    }
    static boolean PrimeCheck2(int n){
        if(n == 0) return false;
        for(int i =2;i*i<n;i++){
            if(n % i==0){
                return false;
            }
        }
        return true;
    }
    static boolean PrimeCheck3(int n){
        if(n == 0) return false;
        if(n == 2 || n == 3)return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i =5;i*i<=n;i=i+6){
            if(n % i ==0 ||n %(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=sc.nextInt();
        sc.close();
        boolean check=PrimeCheck(n);
        boolean check2=PrimeCheck2(n);
        boolean check3=PrimeCheck3(n);
        System.out.println(check);
        System.out.println(check2);
        System.out.println(check3);
    }
}
