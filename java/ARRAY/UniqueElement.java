import java.util.Scanner;

class Unique{
    void UqElement(int arr[],int key){
        int count=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==key){
                count++;
            }
        }
        if(count==1){
            System.err.println("your give value is uique in the array");
        }else{
            System.out.println("your give value is repeated:");
        }
    }
}
public class UniqueElement{
    public static void main(String[] args) {
        int arr[]={10,20,30,10,30};
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n=sc.nextInt();
        sc.close();
        Unique uq=new Unique();
        uq.UqElement(arr, n);
    }
}