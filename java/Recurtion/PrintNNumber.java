import java.util.Scanner;

class AllNumber{
    void printAllNumber(int n){
        if(n==1){//this is the base case which presevent from the stackOverflow and infifnite recurtion
            System.out.println(1);
            return;
        }
        printAllNumber(n-1);
        System.out.println(n);
    }
}
public class PrintNNumber{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter any number :");
        int num=sc.nextInt();
        sc.close();
        AllNumber sum=new AllNumber();
        System.out.println("the numbers are :");
        sum.printAllNumber(num);
    }
}