public class CountFreq {
    static void PrintFreq(int arr[]){
        int n=arr.length;
        int i=1,freq=1;
        while(n>i){
            while(n>i && arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+"="+freq);
            i++;
            freq=1;
        }
        if(n==1 || arr[n-1] !=arr[n-2]){
            System.out.println(arr[i-1]+" "+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,20,30,30,30};
        PrintFreq(arr);
    }
}
