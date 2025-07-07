class FirstEle{
    int Number(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
public class FirstRepeat {
    public static void main(String[] args) {
        int arr[]={20,30,40,50};
        FirstEle fs=new FirstEle();
        int result=fs.Number(arr);
        if(result!=-1){
            System.out.println("element have a double pair:"+result);
        }else{
            System.out.println("not found at the index:"+result);
        }
    }
}
