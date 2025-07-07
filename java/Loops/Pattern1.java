import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number of row:");
        int n=sc.nextInt();
        System.out.println("please enter the number of column:");
        int m=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
