import java.util.Scanner;

public class Axis {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter the x:");
        int x=sc.nextInt();
        System.out.println("please enter the y:");
        int y=sc.nextInt();
        sc.close();
        if(x==0 && y==0){
            System.out.println("at Origin");
        }else if(x==0){
            System.out.println("point at the y axis");
        }else{
            System.out.println("point at the x axis");
        }
    }
}
