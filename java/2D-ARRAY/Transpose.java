//transpose of the matrix
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the row:");
        int row=sc.nextInt();
        System.out.println("enter the size of the col:");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        int ele=row*col;
        System.out.println("enter the "+ele+" element of the array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("printing the original array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("the transpose of the array:");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
