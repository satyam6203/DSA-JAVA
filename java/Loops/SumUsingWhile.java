import java.util.Scanner;

public class SumUsingWhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the number:");
        int num=sc.nextInt();
        sc.close();
        int i=1;
        int sum=0;
        while(i<=num){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
