import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Intersection {
    static void Method1(int arr[],int arr1[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
    static List<Integer> Method2(int arr[],int arr1[]){
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        
    }
}
