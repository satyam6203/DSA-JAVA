import java.util.Scanner;

public class TriplateSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num=sc.nextInt();
        sc.close();
        int count=0;
        int arr[]={1,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==num){
                        count ++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
