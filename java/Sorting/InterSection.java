public class InterSection {
    static void Method1(int arr[],int arr1[]){
        int n=arr.length;
        int m=arr1.length;
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=0;j<m;j++){
                if(arr[i]==arr1[j]){
                    System.out.println(arr[i]+" ");
                    break;
                }
            }
        }
    }
    static void Method2(int arr[],int arr1[]){
        int n=arr.length;
        int m=arr1.length;
        int i=0,j=0;
        while(i<n && j<m){
            if(i>0 && arr[i]==arr[i-1]){
                i++;
                continue;
            }
            if(j>0 && arr[j]==arr[j-1]){
                j++;
                continue;
            }
            if(arr[i]>arr1[j]){
                j++;
            }
            else if(arr[i]<arr1[j]){
                i++;
            }
            else{
                System.out.println(arr[i]+" ");
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int arr1[]={10,30,40,20};//this array is not sorted so the output in the 2nd method is differ
        Method1(arr, arr1);
        System.out.println();
        Method2(arr, arr1);
    }
}
