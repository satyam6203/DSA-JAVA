import java.util.Scanner;

public class LinearSearch {
    static int search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int res=search(arr, key);
        if(res !=-1){
            System.out.println("At index :"+res);
        }
        else{
            System.out.println("not present in the arr");
        }
        sc.close();
    }
}
