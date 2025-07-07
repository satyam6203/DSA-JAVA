import java.util.Scanner;

class Search{
    static int[] MakeFerqArray(int[] arr){
        int[] ferq=new int[100000];
        for(int i=0;i<arr.length;i++){
            ferq[arr[i]]++;
        }
        return ferq;
    }
}
public class ElementSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        System.out.println("please enter the array:");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int[] ferq=Search.MakeFerqArray(arr);
        System.out.println("please enter the number of time you want to check:");
        int n=sc.nextInt();
        sc.close();
        while(n>0){
            System.out.println("please enter the number:");
            int x=sc.nextInt();
            if(ferq[x]>0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            n--;
        }
    }

    

    
}
