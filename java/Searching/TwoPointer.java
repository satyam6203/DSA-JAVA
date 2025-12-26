import java.util.Scanner;

public class TwoPointer {
    static boolean simpleLoop(int arr[],int key){
        int low=0,high=arr.length;
        for(int i=low;i<high;i++){
            for(int j=high-1;j>=low;j--){
                if(arr[i]+arr[j]==key){
                    return true;
                    // System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
        return false;
    }
    static boolean tooPointer(int arr[],int n){
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==n){
                return true;
            }
            else if(arr[i]+arr[j]<n){
                i++;
            }
            else{
                i--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,20,40,5};
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        System.out.println(simpleLoop(arr, key));
        System.out.println(tooPointer(arr, key));
        // pointer(arr, key);
    }
}
