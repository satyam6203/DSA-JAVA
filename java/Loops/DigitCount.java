import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("Number of the digit is :"+count);
    }
}
