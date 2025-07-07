// import java.util.Arrays;
// import java.util.Scanner;

class Second{
    void Element(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        // int max=findMax(arr);
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==max){
        //         max=Integer.MIN_VALUE;
        //     }
        // }
        // int senconele=findMax(arr);
    }
}
public class SecondLarge {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        // int n=arr.length;
        Second sc=new Second();
        sc.Element(arr);
    }
}
