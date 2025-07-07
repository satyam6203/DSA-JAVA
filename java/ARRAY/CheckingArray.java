import java.util.Scanner;

class CheckShorted{
    boolean number(int arr[],int n){
        boolean check=true;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }
}
public class CheckingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        sc.close();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        CheckShorted sh=new CheckShorted();
        boolean result=sh.number(arr, n);
        if(result==true){
            System.out.println("array is shorted :");
        }else{
            System.out.println("array is not shorted");
        }
    }
}
