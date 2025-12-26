import java.util.Arrays;

public class MoveZero {
    static int[] Move(int arr[]){
        int count=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={10,0,20,20,0,70,0};
        System.out.println(Arrays.toString(Move(arr)));
    }
}
