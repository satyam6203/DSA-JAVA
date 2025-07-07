import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the number:");
        int num=sc.nextInt();
        sc.close();
        for(int i=1;i<=num;i++){
            System.out.println(i);
        }
    }
}
