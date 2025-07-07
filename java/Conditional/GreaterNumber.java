import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number 1:");
        int first=sc.nextInt();
        System.out.println("please enter the number 2nd:");
        int second=sc.nextInt();
        System.out.println("please enter the number 3rd:");
        int third=sc.nextInt();
        sc.close();
        if(first>second && first>third){
            System.out.println("fist number is the greatest number.");
        }else if(second>third){
            System.out.println("second number is the greatest number.");
        }else{
            System.out.println("third number is greatest.");
        }
    }
}
