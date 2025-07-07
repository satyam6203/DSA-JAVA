import java.util.Scanner;

class Reverse{
    void ReverseEle(int arr[]){
        System.out.println("the reversed number:");
        for(int i=arr.length-1;i>=0;i--){
            System.err.print(" "+arr[i]);
        }
    }
}
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please eneter the size of arr:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("enter the element of the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        Reverse re=new Reverse();
        re.ReverseEle(arr);
    }
}
