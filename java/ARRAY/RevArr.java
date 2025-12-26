public class RevArr {
    static void reverse(int arr[],int n){
        int low=0,high=n-1;
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println("Original Array:");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int n=arr.length;
        System.out.println();
        System.out.println("Reversed Array:");
        reverse(arr, n);
    }
}
