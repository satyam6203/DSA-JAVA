import java.util.Scanner;

class Number{
    void Greater(int arr[],int n,int key){
        int count =0;
        System.out.println("Number is greater than given number:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]>key){
                System.out.print(arr[i]+" ");
                count++;
            }
        }
        System.out.println("\ncount of greater number:"+count);
    }
}
public class StrictlyGreater {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int n=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number:");
        int key=sc.nextInt();
        sc.close();
        Number num=new Number();
        num.Greater(arr, n, key);
    }
}
