import java.util.Arrays;

public class SelectionSort {
    static void SelectSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min_ele=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_ele]){
                    min_ele=j;
                }
            }
            int temp=arr[min_ele];
            arr[min_ele]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={20,30,2,10,60,6,5};
        SelectSort(arr);
    }
}
