//multiplication of the two matrix
import java.util.Scanner;

public class MultiOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the number of row:");
        int row1=sc.nextInt();
        int row2=sc.nextInt();
        System.out.println("please enter the number of col");
        int col1=sc.nextInt();
        int col2=sc.nextInt();
        if(col1!=row2){
            System.out.println("Multiplication is not possible:");
        }
        else{
            int[][] arr1=new int[row1][col1];
            int[][] arr2=new int[row2][col2];
            int result[][] = new int[row1][col2];
            System.out.println("Puttin the value in array 1:");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    arr1[i][j]=sc.nextInt();
                }
            }

            System.out.println("Puttin the value in array 2:");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    arr2[i][j]=sc.nextInt();
                }
            }

            System.out.println("printing the array :1");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println("printing the values of the array:2");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Multiplying  the arrays:");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    for(int k=0;k<col1;k++){
                        result[i][j] += arr1[i][k]*arr2[k][j];
                    }
                }
            }

            System.out.println("printing the final values:");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
            sc.close();
        }
    }
}
