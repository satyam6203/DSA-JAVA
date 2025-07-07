public class ForArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        //printing by for loop
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        //printing by for Each loop
        System.out.println("------------------------------");
        for(int arg:arr){
            System.out.println(arr[arg]);
        }
    }
}
