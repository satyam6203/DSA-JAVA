import java.util.Scanner;
class Rotate{
    static int[] elementRotate(int arr[],int k){
        int n=arr.length;
        k=k%n;
        int j=0;
        int[] ans=new int[n];
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
}
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the size of arr:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("please eneter the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("key to rotate:");
        int k=sc.nextInt();
        sc.close();
        int[] rotated=Rotate.elementRotate(arr, k); 
        System.out.println("array after the rotation:");
        for(int i=0;i<rotated.length;i++){
            System.out.print(rotated[i]+" ");
        }

    }
}
