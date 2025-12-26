public class SecondLarge2 {
    static int findLarge(int arr[]){
        int maxIndes=0;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>arr[maxIndes]){
                maxIndes=i;
            }
        }
        return maxIndes;
    }
    static int secondLarge(int arr[]){
        int large=findLarge(arr);
        int res=-1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=arr[large]){
                if(res==-1 || arr[i]>arr[res]){
                    res= i;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println(secondLarge(arr));
    }
}
