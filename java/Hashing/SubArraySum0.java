import java.util.HashSet;

public class SubArraySum0 {
    static boolean Is0SubArray(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum +=arr[j];
                if(sum ==0){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean Method1(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(set.contains(sum)){
                return true;
            }
            if(sum==0){
                return true;
            }
            set.add(arr[i]);
        }
        return false;

    }
    public static void main(String[] args) {
        
    }
}
