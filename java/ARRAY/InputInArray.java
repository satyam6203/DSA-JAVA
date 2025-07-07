import java.util.Scanner;

public class InputInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("input of the user :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Output of array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
