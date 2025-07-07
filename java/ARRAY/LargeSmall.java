import java.util.Arrays;
import java.util.Scanner;

class CheckIngNumber{
    void LargeSmall(int arr[],int n){
        Arrays.sort(arr);
        System.out.println("Smallest element of the arr:"+arr[0]);
        System.out.println("largest element of arr:"+arr[n-1]);
    }
}
public class LargeSmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        CheckIngNumber ch=new CheckIngNumber();
        ch.LargeSmall(arr, n);
    }
}
