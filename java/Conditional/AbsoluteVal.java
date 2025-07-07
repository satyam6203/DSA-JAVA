import java.util.Scanner;

public class AbsoluteVal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number :");
        int num=sc.nextInt();
        sc.close();
        if(num>0){
            System.out.println(num);
        }else if(num<0){
            System.out.println(-(num));
        }
        else{
            System.out.println("invalied number");
        }
    }
}
