//rotation of the array 90 degree
import java.util.Scanner;

public class MatRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the row:");
        int row=sc.nextInt();
        System.out.println("enter the size of row:");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        int ele=row*col;
        System.out.println("enter the"+ele+" element os the array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the original array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int[][] result=new int[row][col];
        System.out.println("rotated array:");
        for(int i=row-1;i>=0;i--){
            for(int j=0;j<col;j++){
                result[j][row-1-i]=arr[i][j];
            }
        }
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
