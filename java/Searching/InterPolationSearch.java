import java.util.Scanner;

public class InterPolationSearch {
    static int IpSearch(int arr[],int key){
        int low=0,high=arr.length-1;
        while(low<=high && key>=arr[low] && key<=arr[high]){
            if(arr[low]==arr[high]){
                if(arr[low]==key) return low;
                else return -1;
            }
            int mid= low + ((key - arr[low]) * (high - low) / (arr[high] - arr[low]));
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>mid){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]={10,20,30,40,50,60};
        int res=IpSearch(arr, n);
        if(res != -1){
            System.out.println("Index At :"+res);
        }
        else{
            System.out.println("not present");
        }
        sc.close();
    }
}
