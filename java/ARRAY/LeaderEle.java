public class LeaderEle {
    static void Approach1(int arr[]){
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false) System.out.print(arr[i]+" ");
        }
    }
    static void Approach2(int arr[]){
        int n=arr.length;
        int leader=arr[n-1];
        System.out.println(leader);
        for(int i=n-2;i>=0;i--){
            if(leader<arr[i]){
                leader=arr[i];
                System.out.print(leader+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,4,50,6,8,3};
        Approach1(arr);
        System.out.println();
        Approach2(arr);
    }
}
