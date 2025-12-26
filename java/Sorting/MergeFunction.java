public class MergeFunction{
    public static void func(int arr[],int low,int mid,int high){
        int n1=mid-low+1,n2=high-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+i+1];
        }
        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }
            else{
                arr[k]=right[j];
                k++;
                j++;
            }
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
    static void MergeSort(int arr[],int l,int r){
        if(l<r){
            int mid=l+(r-l)/2;
            MergeSort(arr,l,mid);
            MergeSort(arr,mid+1, r);
            func(arr, l, mid, r);
        }
    }
    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        MergeSort(arr, 0, arr.length - 1);
        for (int x : arr)
            System.out.print(x + " ");
    }
}