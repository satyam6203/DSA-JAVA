public class PeakElement {
    static int Approach1(int nums[]){
        int n=nums.length;
        int ans=0;
        if(n==1) return nums[0];
        if(nums[0]>=nums[1]) return nums[0];
        if(nums[n-1]>=nums[n-2]) return nums[n-1];
        for(int i=1;i<n-1;i++){
            if(nums[i]>=nums[i-1] && nums[i]>=nums[i+1]){
                ans=i;
            }
        }
        return ans;
    }
    static int Approach2(int nums[]){
        int n=nums.length;
        int res=0;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if((mid==0||nums[mid-1]<=nums[mid])&&(mid==n-1||nums[mid+1]<=nums[mid])){
                res= mid;
            }
            if(mid>0 && nums[mid-1]>=nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
