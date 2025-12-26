import java.util.Scanner;
class PrintSpiral{
    void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    void SpiralArray(int[][] arr,int c,int r){
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalElement=0;
        while(totalElement<r*c){
            for(int j =leftCol;j<=rightCol && totalElement<r*c;j++){
                System.out.print(arr[topRow][j]+" ");
                totalElement++;
            }
            topRow++;
            for(int i=topRow;i<=bottomRow && totalElement<r*c;i++){
                System.out.print(arr[i][rightCol]+" ");
                totalElement++;
            }
            rightCol--;
            for(int j=rightCol;j>=leftCol && totalElement<r*c;j--){
                System.out.print(arr[bottomRow][j]+" ");
                totalElement++;
            }
            bottomRow--;
            for(int i=bottomRow;i>=topRow && totalElement<r*c;i--){
                System.out.print(arr[i][leftCol]+" ");
                totalElement++;
            }
            leftCol++;
        }
    }
}
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the row and col:");
        int col=sc.nextInt();
        int row=sc.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("enter the elements: ");
        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        PrintSpiral p=new PrintSpiral();
        System.out.println("the given matrix is :");
        p.printArray(arr);
        System.out.println("Spiral of it :");
        p.SpiralArray(arr, col, row);
    }
}
