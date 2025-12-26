public class InversionArray {
    static int  Method(int arr[]){
        int res=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    res++;
                }
            }
        }
        return res;
    }
    static int Method2(int arr[],int left,int right){
        int res=0;
        if(left<right){
            int mid=left+(right-left)/2;
            res += Method2(arr,left,mid);
            res += Method2(arr, mid+1, right);
            res += countAndMerge(arr,left,mid,right);
        }
        return res;
    }
    static int countAndMerge(int arr[],int l,int m,int r){
        int n1=m-l+1,n2=r-m;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[i+l];
        }
        for(int i =0;i<n2;i++){
            right[i]=arr[m+1+i];
        }
        int res=0,i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }
            else{
                arr[k]=right[j];
                j++;
                res+=(n1-i);
                k++;
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
        return res;
    }
    public static void main(String[] args) {
        int arr[]={20,40,30,50,10};
        System.out.println(Method(arr));
        System.out.println(Method2(arr, 0, arr.length-1));
    }
}
