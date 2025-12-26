import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element you want to enter :");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            list.add(val);
        }
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            Integer i=it.next();
            System.out.print(i+" ");
        }
        //reverse of the iterator
        System.out.println();
        ListIterator<Integer> itr=list.listIterator(list.size());
        while(itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }
    }
}
