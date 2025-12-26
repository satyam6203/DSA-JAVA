// import java.util.Scanner;
public class Cout1s {
    static void Approach01(int arr[]){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
        }
        System.out.println(count);
    }
    static int Approach2(int arr[]){
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==0) low=mid+1;
            else{
                if(mid==0||arr[mid-1]==0) return (n-mid);
                else high= mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int arr[]={0,0,0,1,1,1,1,1};//this is a binary array
        Approach01(arr);
        System.out.println(Approach2(arr));
    }
}
