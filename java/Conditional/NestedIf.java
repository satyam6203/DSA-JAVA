import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter the number:");
        int num=sc.nextInt();
        sc.close();
        if(num%5==0 || num%3==0){
            if(num%15!=0){
                System.out.println("the number is divisble by  5 or 3.");
            }
            else{
                System.out.println("not divisble.");
            }
        }
        else{
            System.out.println("Invalied number.");
        }
    }
}
