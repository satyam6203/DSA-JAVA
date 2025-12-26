//create a jacked array

import java.util.Scanner;

public class PascalTr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size=sc.nextInt();
        int[][] arr=new int[size][];
        int[][] result=new int[size][];
        for(int i =0;i<size;i++){
            arr[i]    = new int[i + 1];
            result[i] = new int[i + 1];

            result[i][0]=arr[i][i]=1;
            for(int j=0;j<i;++j){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
            
        }
        System.out.println("the original array:");
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result.length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
