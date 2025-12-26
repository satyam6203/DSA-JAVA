import java.util.Scanner;

class DeleteEle{
    public int deleEle(int arr[],int x,int n){
        int i ;
        for(i=0;i<n;i++){
            if(arr[i] ==x){
                break;
            }
        }
        if(i == n){//if the element is not present then it size remains same
            return n;
        }
        for(int j =i;j<n-1;j++){//this loop execute after the break element
            arr[j]=arr[j+1];
        }
        return n-1;
    }
}
public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("input of the user :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("please enter the element to delete :");
        int x=sc.nextInt();
        sc.close();
        DeleteEle dl=new DeleteEle();
        int newSize=dl.deleEle(arr, x, n);
        for(int i =0;i<newSize;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
