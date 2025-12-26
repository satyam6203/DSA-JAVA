public class FindLargest2 {
    static int large(int arr[]){
        for(int i =0;i<arr.length;i++){
            boolean falg=true;
            for(int j=0;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    falg=false;
                    break;
                }
            }
            if(falg==true){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println(large(arr));
    }
}