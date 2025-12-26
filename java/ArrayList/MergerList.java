import java.util.ArrayList;
import java.util.Arrays;

public class MergerList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        int arr1[]={10,20,30,40};
        int arr2[]={20,40,50,60};
        for(int n:arr1){
            list.add(n);
        }
        for(int n:arr2){
            list1.add(n);
        }
        list.addAll(list1);
        // System.out.println(list);
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
