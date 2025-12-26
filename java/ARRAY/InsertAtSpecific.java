import java.util.Scanner;

public class InsertAtSpecific {
    static void insertAt(int[] arr, int pos, int ele, int size){
        if(pos==arr.length){
            System.out.println("you cant insert array is full");
            return;
        }
        int index=pos-1;
        for(int i=size-1;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=ele;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        arr[0]=10;
        arr[1]=10;
        arr[2]=10;
        arr[3]=10;
        int size=4;
        int pos=sc.nextInt();
        int ele=sc.nextInt();
        insertAt(arr, pos, ele, size);
        for(int i=0;i<size+1;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
