import java.util.Scanner;
//if sum of the two side is greater than third side than it form a triangle 
public class TriangleCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first side:");
        int a=sc.nextInt();
        System.out.println("enter the second side:");
        int b=sc.nextInt();
        System.out.println("enter the third side:");
        int c=sc.nextInt();
        sc.close();
        if((a+b)>c && (b+c)>a && (c+a)>b){
            System.out.println("give side form triangle");
        }
        else{
            System.out.println("not form a triangle");
        }
    }
}
