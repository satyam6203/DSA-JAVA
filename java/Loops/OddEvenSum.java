import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number:");
        int n=sc.nextInt();
        sc.close();
        int even_sum=0;
        int odd_sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                even_sum +=i;
            }else{
                odd_sum +=i;
            }
        }
        int result=odd_sum-even_sum;
        System.out.println(result);
    }
}
