import java.util.Scanner;

public class GivenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number :");
        int num=sc.nextInt();
        sc.close();
        int count=0;
        int arr[]={10,20,30,40,50};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==num){
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
