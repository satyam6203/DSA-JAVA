class Multi{
    void ToDArray(){
        int[][] arr=new int[2][2];
        arr[0][0]=10;
        arr[0][1]=20;
        arr[1][0]=30;
        arr[1][1]=40;
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
    }

    void literal(){
        int arr[][]={{10,20,30},{10,20,30},{40,50,60}};
        System.out.println(arr[0][1]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][2]);
    }
}
public class MultiArray {
    public static void main(String[] args) {
        Multi m=new Multi();
        System.out.println("by object usin new key word");
        m.ToDArray();
        System.out.println("this is by array literal:");
        m.literal();
    }
}
