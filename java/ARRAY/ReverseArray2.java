class reverse{
    static void swapInt(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reversearray(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            swapInt(arr, i, j);
            i++;
            j--;
        }
    }
}
public class ReverseArray2 {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        reverse.reversearray(arr);

        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
