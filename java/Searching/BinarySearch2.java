//it is only work on the shorted array.
import java.util.Scanner;

public class BinarySearch2 {
    static int Bianry2(int arr[],int low, int high, int target){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(arr[mid]==target) 
            return mid;
        else if(arr[mid]>target) 
            return Bianry2(arr, low,mid-1,target);
        else 
            return Bianry2(arr, mid+1, high, target);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int low=0,high=arr.length-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element to find the position:");
        int key=sc.nextInt();
        sc.close();
        int res=Bianry2(arr,low,high,key);
        if(res!=-1){
            System.out.println("element found at the index:"+res);
        }else {
            System.out.println(key+" is not present in the array");
        }
    }
}