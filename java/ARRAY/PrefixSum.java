import java.util.Scanner;

class Prefix{
    void Approach(int arr[],int start,int end){
        int sum=0;
        for(int i =start;i<=end;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    void Approch2(int arr[]){
        int n=arr.length;
        int[] ps=new int[n];
        ps[0]=arr[0];
        for(int i =1;i<n;i++){
            ps[i]=ps[i-1]+arr[i];
        }
    }
    int getSum(int ps[],int st,int end){
        if(st==0){
            return ps[end];
        }
        return ps[st]-ps[end-1];
    }
}
public class PrefixSum {
    public static void main(String[] args) {
        Prefix pr=new Prefix();
        int arr[]={10,20,30,4,50};
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        pr.Approach(arr, start, end);
    }
}
