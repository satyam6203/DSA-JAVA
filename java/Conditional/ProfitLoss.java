import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the selling price:");
        int sp=sc.nextInt();
        System.out.println("please enter the cost price:");
        int cp=sc.nextInt();
        sc.close();
        if(sp>cp){
            System.out.println("seller has made the profit.");
            int profit =sp-cp;
            System.out.println("profit is :"+profit);
        }
        else if(cp>sp){
            System.out.println("seller has made the loss.");
            int loss=cp-sp;
            System.out.println("loss :"+loss);
        }else{
            System.out.println("seller sell the item with no befit or loss.");
        }
    }
}
