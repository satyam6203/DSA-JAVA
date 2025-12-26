public class SortedSearch {
    static int search(int[] nums, int target) {
        int n=nums.length;
        int left=0,right=n-1;
        while(left<=right){
            int mid=(left +right)/2;
            if(nums[mid]==target) return mid;//normal binary search
            else if(nums[left]<=nums[mid]){//if the left part is sorted
                if(target>=nums[left] && target<nums[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{//if the right part is sorted
                if(target<=nums[right] && target>nums[left]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){

    }
}
