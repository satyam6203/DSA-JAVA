class Declar{
    void array(){
        int[] arr=new int[5];//decleration by :object
        // int arr[5]={} this is the decleraion by using the array literals
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        // arr[10]=100; this is consider as array out of bond 
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
}
public class ArrayDec{
    public static void main(String[] args) {
        Declar d=new Declar();
        d.array();
    }
}