import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the number of row:");
        int row=sc.nextInt();
        System.out.println("please enter the number of col");
        int col=sc.nextInt();
        if(row!=col){
            System.out.println("you are not taking the Square matrix:");
            System.out.println("so addition is not possible");
        }
        else{
            int[][] arr1=new int[row][col];
            int[][] arr2=new int[row][col];
            int[][] result=new int[row][col];
            System.out.println("Puttin the value in array 1:");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    arr1[i][j]=sc.nextInt();
                }
            }

            System.out.println("Puttin the value in array 2:");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    arr2[i][j]=sc.nextInt();
                }
            }

            System.out.println("printing the array :1");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println("printing the values of the array:2");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("adding the arrays:");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    result[i][j]=arr1[i][j]+arr2[i][j];
                }
            }

            System.out.println("printing the final values:");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
            sc.close();
        }

    }
}
