//print the natural number from n to 1
import java.util.Scanner;

public class PrintNaturalNum {
    static void printNauralnum(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNauralnum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the any number :");
        int num=sc.nextInt();
        sc.close();
        printNauralnum(num);
    }
}
