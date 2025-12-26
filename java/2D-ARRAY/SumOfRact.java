import java.util.Scanner;

public class SumOfRact {

    static int findSum(int[][] mat,int c1,int r1,int c2,int r2){
        int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum += mat[i][j];
            }
        }
        return sum;
    }

    static void findPrefixSum(int[][] matrix){
        int r=matrix.length;
        int col=matrix[0].length;
        for(int i =0;i<r;i++){
            for(int j =1;j<col;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }

    static int findSum2(int[][] mat,int c1,int r1,int c2,int r2){
        int sum=0;
        findPrefixSum(mat);
        for(int i=r1;i<=r2;i++){
            if(r1>=1)
                sum += mat[i][c2] - mat[i][c1-1];
            else
                sum += mat[i][c2];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row and column:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        System.out.println("Please enter the array element :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter ractangle boundries r1,r2,c1,c2 :");
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        int c1=sc.nextInt();
        int c2=sc.nextInt();
        sc.close();
        System.out.println("Ractangle Sum :"+findSum(arr, c1, r1, c2, r2));
        System.out.println("ractangle sum:"+findSum2(arr, c1, r1, c2, r2));
    }
}
