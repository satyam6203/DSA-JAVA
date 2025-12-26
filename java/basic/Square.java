
import java.util.*;
class Square{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the any number:");
        int n=sc.nextInt();
        sc.close();
        int res=1 << n;
        System.out.println(" Left shift of the number number :-> "+res);
    }
}