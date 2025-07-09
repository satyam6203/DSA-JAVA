import java.util.Scanner;

public class InitialArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enete the row:");
        int row=sc.nextInt();
        System.out.println("please enter the col:");
        int col=sc.nextInt();
        int[][] arr= new int[row][col];
        int ele=row*col;
        System.out.println("enter the "+ele+" array element:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println("printing the values of the array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}