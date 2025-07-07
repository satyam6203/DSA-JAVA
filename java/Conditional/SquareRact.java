import java.util.Scanner;

public class SquareRact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the length:");
        int lenght=sc.nextInt();
        System.out.println("please enter the breadth");
        int breadth=sc.nextInt();
        sc.close();
        if(lenght==breadth){
            System.out.println("the given diagram is square.");
        }else{
            System.out.println("given diagram is ractangle.");
        }
    }
}
