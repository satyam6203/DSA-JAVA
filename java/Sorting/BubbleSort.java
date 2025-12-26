import java.util.Arrays;
public class BubbleSort {
    static void Sort(int arr[]){
        int n=arr.length;
        for(int i =0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
    static void Sort1(int arr[]){
        int n=arr.length;
        for(int i =0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    //in the case of array is already sorted
    static void SortedCase(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean swap=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={10,30,20,50,40,60};
        // Sort(arr);
        Sort1(arr);
        SortedCase(arr);
    }   
}
