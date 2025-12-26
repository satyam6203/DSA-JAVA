import java.util.Arrays;
import java.util.Scanner;

public class RoateFromk2 {
    static void reverse(int arr[],int low,int high){
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    static void LeftRo(int arr[],int n,int k){
        k=k%n;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,40,50,60};
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int n=arr.length;
        LeftRo(arr, n, num);
    }
}
