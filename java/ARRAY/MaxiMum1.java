public class MaxiMum1 {
    static int  Approach1(int arr[]){
        int res=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==1){
                    count++;
                }
                else{
                    break;
                }
            }
            res=Math.max(count,res);
        }
        return res;
    }
    static int Approach2(int arr[]){
        int count=0;
        int res=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                count=0;
            }
            else{
                count++;
                res=Math.max(res, count);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,0,1,1,1,1,0,0,1,0,1};
        System.out.println(Approach1(arr));
        System.out.println(Approach2(arr));
    }
}
