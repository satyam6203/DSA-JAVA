import java.util.Scanner;

public class CountElem {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,10,2,10,10};
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number:");
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                count++;
            }
        }
        System.out.println("your number:"+n+" is repeated :"+count+" times");
    }
}
