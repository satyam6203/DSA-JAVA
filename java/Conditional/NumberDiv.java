import java.util.*;
public class NumberDiv {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter your number:");
        int number=sc.nextInt();
        sc.close();
        if(number%5==0){
            System.out.println("number is divisble by 5");
        }else{
            System.out.println("number is not divisble by 5");
        }
    }
}
