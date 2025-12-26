import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RorateFromK {
    static void Roate(int arr[],int k){
        int n=arr.length;
        k=k%n;
        int[] temp=new int[k];
        for(int i =0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        for(int i =0;i<k;i++){
            arr[n-k+i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the index number :");
        int n =sc.nextInt();
        Roate(arr, n);

    }
}
