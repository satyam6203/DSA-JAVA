import java.util.Scanner;

public class ThreeDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the number:");
        int num=sc.nextInt();
        sc.close();
        if(num>99 && num<1000){
            System.out.println("you enter the three digit number:"+num);
        }else if(num>9 && num<100){
            System.out.println("you enter the two digit number:"+num);
        }else{
            System.out.println("you enter the number:"+num);
        }
    }
}
