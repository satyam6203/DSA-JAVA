import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]={10,30,20,40,50,60,70,10,20,30};
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        if(map.containsKey(10)){
            System.out.println("yaahh");
        }
        else{
            System.out.println("No");
        }
        // map.remove(10);
        System.out.println(map.size());
        if(map.containsValue(2)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(map.get(10));
    }
}
