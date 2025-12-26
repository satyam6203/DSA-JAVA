import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element you want to add :");
        int n=sc.nextInt();
        System.out.println("enter the number :");
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            set.add(val);
        }
        System.out.println(set);//print the set
        System.out.println(set.size());//print the size of the set
        System.out.println(set.contains(10));
        Iterator<Integer> i=set.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set);
    }
}
