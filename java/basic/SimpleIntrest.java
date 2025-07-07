import java.util.*;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the Principle:");
        int p=sc.nextInt();
        System.out.println("enter the time :");
        int t=sc.nextInt();
        System.out.println("enter the rate :");
        int r=sc.nextInt();
        sc.close();
        float si=(p*r*t)/100f;
        System.out.println("the simple interst:"+si);
    }
}
