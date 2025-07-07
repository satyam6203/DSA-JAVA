import java.util.Scanner;

class occurance{
    int number(int arr[],int n,int number){
        int LastIndex=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==number){
                LastIndex=i;
            }
        }
        return LastIndex;
    }
}

public class LastOccurance {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,10};
        int n=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the  number:");
        int number=sc.nextInt();
        sc.close();
        occurance oc=new occurance();
        System.out.println(oc.number(arr, n, number));

    }
}
