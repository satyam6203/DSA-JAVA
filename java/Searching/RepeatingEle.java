public class RepeatingEle {
    static int Method1(int arr[]){
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(arr[i]==arr[j]){
                    res= arr[i];
                }
            }
        }
        return res;
    }
    static int Method2(int arr[]){
        int n=arr.length;
        int res=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                res=arr[i];
            }
        }
        return res;
    }
    // static void 
    public static void main(String[] args) {
        
    }
}
