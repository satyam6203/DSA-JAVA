import java.util.HashSet;

public class SubArraySum {
    static boolean Method1(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum += arr[i];
                if(sum == key){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean Method2(int arr[],int key,int sum){
        HashSet<Integer> set=new HashSet<>();
        int pre_sum=0;
        for(int n:arr){
            pre_sum +=n;
            if(pre_sum==key) return true;
            if(set.contains(pre_sum-sum)){
                return true;
            }
            set.add(n);
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
