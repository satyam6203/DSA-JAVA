import java.util.Scanner;

public class FindEle {
    static void Search(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==key){
                    System.out.println("found at the i="+i+" j="+j);
                    return;
                }
            }
        }
        System.out.println("not found");
    }
    static void Method(int arr[][],int key){
        int c=arr[0].length;
        int r=arr.length;
        int i=0,j=c-1;
        while(i<r && j>=0){
            if(arr[i][j]==key){
                System.out.println("found at the i="+i+" j="+j);
                return;
            }
            else if(arr[i][j]>key){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("not found");
    }
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
        System.out.println("enter the number to search ");
        int key=sc.nextInt();
        // Search(arr, key);
        Method(arr, key);
        sc.close();
    }
}
