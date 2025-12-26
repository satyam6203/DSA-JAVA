import java.util.Scanner;

public class FibonashiSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[][] arr=new int[a][b];
        for(int i =0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=i+j;
            }
        }
        for(int i =0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        sc.close();

    }
}
