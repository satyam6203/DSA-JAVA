import java.util.Scanner;
class PrintSpiral{
    public void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public int[][] SpiralArray(int n){
        int topRow=0,bottomRow=n-1,leftCol=0,rightCol=n-1;
        int[][] arr=new int[n][n];
        int curr=1;
        while(curr<=n*n){
            for(int j =leftCol;j<=rightCol && curr <=n*n;j++){
                arr[topRow][j]=curr;
                curr++;
            }
            topRow++;
            for(int i=topRow;i<=bottomRow && curr<=n*n;i++){
                arr[i][rightCol]=curr;
                curr++;
            }
            rightCol--;
            for(int j=rightCol;j>=leftCol && curr<n*n;j--){
                arr[bottomRow][j]=curr;
                curr++;
            }
            bottomRow--;
            for(int i=bottomRow;i>=topRow && curr<n*n;i--){
                arr[i][leftCol]=curr;
                curr++;
            }
            leftCol++;
        }
        return arr;
    }
}
public class SpiralMatrix2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size :");
        int n=sc.nextInt();
        sc.close();
        PrintSpiral p=new PrintSpiral();
        int[][] mat=p.SpiralArray(n);
        p.printArray(mat);
    }
}
