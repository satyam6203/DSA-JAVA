import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasic {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        // System.out.println("enter the element:");
        // int n=sc.nextInt();
        // for(int i=0;i<n;i++){
        //     int val=sc.nextInt();
        //     list.add(val);
        // }
        // System.out.println(list);
        // // System.out.println(list.size());
        // System.out.println("this list is not empty "+list.isEmpty());
        // // System.out.println(list.get(3));
        // System.out.println(list.contains(10));
        // // list.remove(2);
        // if(list.contains(10)){
        //     System.out.println(list.indexOf(10));
        // }
        // // if(list.contains(100)){
        // //     System.out.println("element is present in the arrayList");
        // // }
        // // else{
        // //     throw new RuntimeException("this is not present int the list");
        // // }
        // // list.append()
        // // list.clear();
        // list.set(0,200);
        // System.out.println(list);
        int arr[]={10,20,30,40,50,60};
        for(int n:arr){
            list.add(n);
        }
        System.out.println(list);
        // for(int x:list){
        //     System.out.print(x+" ");
        // }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
