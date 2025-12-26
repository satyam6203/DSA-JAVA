import java.util.HashSet;

public class Union {
    static int findUnion(int arr[],int arr1[]){
        HashSet<Integer> set=new HashSet<>();
        for(int n:arr){
            set.add(n);
        }
        for(int n:arr1){
            set.add(n);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int arr1[]={20,30,60};
        System.out.println(findUnion(arr, arr1));
    }
}
