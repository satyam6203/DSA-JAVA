import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionSort {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the List: ");
        int n=sc.nextInt();
        System.out.println("enter the element of the list: ");
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            list.add(val);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
