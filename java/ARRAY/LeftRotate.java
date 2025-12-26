import java.util.Arrays;

public class LeftRotate {
    static void leRotate(int arr[],int n){
        int temp=arr[0];
        for(int i =1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println(Arrays.toString(arr));
        int n=arr.length;
        leRotate(arr,n);
        System.out.println("Array after the shifting");
        System.out.println(Arrays.toString(arr));
    }
}
