import java.util.Arrays;
public class ArraysDotShort{
    public static void main(String[] args) {
        int arr[]={10,20,50,40,30,70,60};
        char str[]={'A','x','C','S','B'};
        int arr1[]={10,20,50,40,30,70,60};
        Arrays.sort(arr);
        Arrays.sort(str);
        Arrays.sort(arr1,1,3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(arr1));
    }
}