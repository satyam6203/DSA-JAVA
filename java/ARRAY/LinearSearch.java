import java.util.Scanner;

class Search{
    int search(int arr[],int n,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the key number:");
        int key=sc.nextInt();
        sc.close();
        int n=arr.length;
        Search search=new Search();
        int result =search.search(arr, n, key);

        if(result!=-1){
            System.out.println("your element is found at the index of :"+result);
        }else{
            System.out.println("invalied number");
        }

    }
}
