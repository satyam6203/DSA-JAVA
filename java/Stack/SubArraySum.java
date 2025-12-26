public class SubArraySum {
    static int Approach1(int nums[]){
        int res=0;
        int n=nums.length;
        for(int i =0;i<n;i++){
            int curr=0;
            for(int j=i;j<n;j++){
                curr=curr+nums[j];
                res=Math.max(res,curr);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
