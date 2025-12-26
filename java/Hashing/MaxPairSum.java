import java.util.HashSet;

public class MaxPairSum {
    static boolean isPair(int arr[],int arr1[],int key){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr[i]+arr[j]==key){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean Method1(int arr[],int key){
        int sum =0;
        HashSet<Integer> set=new HashSet<>();
        for(int n:arr){
            if(set.contains(sum-key)){
                return true;
            }
            else{
                set.add(n);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
