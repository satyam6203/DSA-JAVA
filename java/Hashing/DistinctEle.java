import java.util.HashSet;
import java.util.Scanner;

public class DistinctEle {
    static int Method1(int arr[]){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                count++;
            }
        }
        return count;
    }
    static int Method2(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        return set.size();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={15,12,13,12,13,13,18};
        System.out.println(Method1(arr));
        System.out.println(Method2(arr));
    }
}
