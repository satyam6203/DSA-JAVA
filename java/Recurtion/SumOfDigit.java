import java.util.Scanner;
class Digit{
    int sum(int n){
        if(n==0){
            return 0;
        }
        return sum(n/10)+n%10;
    }
}
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Digit d=new Digit();
        System.out.println(d.sum(n));
    }
}
