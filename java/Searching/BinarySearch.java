    //it is only work on the shorted array.
import java.util.Scanner;

public class BinarySearch{
    static int Bianry(int arr[],int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+high/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element to find the position:");
        int key=sc.nextInt();
        sc.close();
        System.out.println(Bianry(arr, key));
    }
}