import java.util.HashMap;
import java.util.Scanner;
public class MapQuae {
    static void putInMap(HashMap<String, Integer> map, String key, int value){
        map.put(key, value);
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map1=new HashMap<>();

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter value: ");
            int val = sc.nextInt();
            putInMap(map1, name, val);
        }
        System.out.println(map1);
        if(map1.containsKey("satyam")){
            System.out.println("the marks of the satyam is: "+map1.get("satyam"));
        } else {
            System.out.println("This student data not present");
        }
        System.out.println("enter the key to remove:");
        sc.nextLine(); // consume the newline character
        String value=sc.nextLine();
        if(map1.containsKey(value)){
            map1.remove(value);
            System.out.println("after removing the data");
            System.out.println(map1);
        }
        else{
            System.out.println("this key is not present");
        }
    }
}