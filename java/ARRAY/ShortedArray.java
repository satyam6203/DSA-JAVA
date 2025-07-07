class Shorted{
    void num(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            for(int j=n-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
public class ShortedArray {
    public static void main(String[] args) {
        int arr[]={40,50,20,10,60};
        int n=arr.length;
        Shorted sh=new Shorted();
        sh.num(arr, n);
    }
}
