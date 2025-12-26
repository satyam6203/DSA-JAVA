import java.util.Scanner;

public class TriplateSum {
    static boolean tSum(int arr[],int key){
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==key){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    static boolean Approach2(int arr[],int x,int si){
        int n=arr.length;
        int i=si,j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==x){
                return true;
            }
            else if(arr[i]+arr[j]<x){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
    static boolean isTriplate(int arr[],int x){
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            if(Approach2(arr, x-arr[i],i+1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isTriplate(arr, n));
    }
}
