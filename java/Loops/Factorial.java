import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter the number:");
        int n=sc.nextInt();
        sc.close();
        int facto=1;
        for(int i=n;i>=1;i--){
            facto *= i;
        }
        System.out.println("factorial of the given number: "+facto);
    }
}
