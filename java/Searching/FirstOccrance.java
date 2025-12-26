import java.util.Scanner;

public class FirstOccrance {
    static int finedele(int arr[],int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    static int usingBinary(int arr[],int low,int high, int target){
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) return usingBinary(arr, mid+1, high, target);
            else if(arr[mid]>target) return usingBinary(arr, low,mid-1, target);
            else{
                if(mid==0 ||arr[mid-1] != arr[mid]){
                    return mid;
                }
                else{
                    return usingBinary(arr, low, mid-1, target);
                }
            }
            
        }
        return -1;
    }
    static int Method2(int arr[],int key){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]>key){
                high=mid-1;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else{
                if(mid==0||arr[mid-1]!=arr[mid]){
                    return mid;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,10,10,10,20,30,40,50};
        Scanner sc=new Scanner(System.in);
        int low=0,high=arr.length-1;
        System.out.println("please enter the number to search: ");
        int key=sc.nextInt();
        sc.close();
        int res=finedele(arr, key);
        int res2=usingBinary(arr, low, high, key);
        int res3=Method2(arr, key);
        if(res!=-1){
            System.out.println("element found at the index:"+res);
        }else {
            System.out.println(key+" is not present in the array");
        }
        if(res2!=-1){
            System.out.println("element found at the index:"+res);
        }else {
            System.out.println(key+" is not present in the array");
        }
        if(res3!=-1){
            System.out.println("element found at the index:"+res);
        }else {
            System.out.println(key+" is not present in the array");
        }
    }
}
