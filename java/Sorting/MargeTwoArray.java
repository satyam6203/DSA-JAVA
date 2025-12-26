import java.util.Arrays;
import java.util.Scanner;

public class MargeTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the fist array :");
        int s1=sc.nextInt();
        int arr1[]=new int[s1];
        System.out.println("enter the value in the first Array :");
        for(int i=0;i<s1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("enter the size of 2nd Array :");
        int s2=sc.nextInt();
        int arr2[]=new int[s2];
        System.out.println("enter the element of the Array :");
        for(int i=0;i<s2;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("marging the both array :");
        int res[]=new int[s1+s2];
        for(int i =0;i<s1;i++){
            res[i]=arr1[i];
        }
        for(int i=0;i<s2;i++){
            res[s1+i]=arr2[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
