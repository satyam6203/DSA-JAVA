import java.util.HashMap;
import java.util.Map;

public class Frequency {
    static void freq(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        for(int n:map.keySet()){
            System.out.println(n+" "+map.get(n));
        }
    }
    static void Method2(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==true) continue;
            int freq=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    freq++;
                }
            }
            System.out.println(arr[i]+" "+freq);
        }
    }
    static void Method3(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n, 0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
    public static void main(String[] args) {
        int arr[]={10,10,20,20,30};
        freq(arr);
        Method2(arr);
        Method3(arr);
    }
}
