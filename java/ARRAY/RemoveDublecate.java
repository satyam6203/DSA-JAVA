public class RemoveDublecate {
    static int removeDuble(int arr[],int n){
        int[] temp=new int[n];
        temp[0]=arr[0];
        int res=1;
        for(int i=1;i<n;i++){
            if(temp[res-1]!=arr[i]){
                temp[res]=arr[i];
                res++;
            }
        }
        for(int i =0;i<res;i++){
            arr[i]=temp[i];
        }
        return res;
    }
    //another approtch
    static int removeDuble1(int arr[],int n){
        int res=1;
        for(int i =1;i<n;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,30,30,30};
        int n=arr.length;
        System.out.println("1st approch");
        System.out.println(removeDuble(arr, n));
        System.out.println("2nd approch");
        System.out.println(removeDuble1(arr, n));
    }
}
