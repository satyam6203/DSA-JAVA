import java.util.ArrayList;
import java.util.LinkedList;

class MyHash{
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;
    MyHash(int b){
        BUCKET=b;
        table=new ArrayList<LinkedList<Integer>>();
        for(int i=0;i<b;i++){
            table.add(new LinkedList<Integer>());
        }
    }
    void insert(int key){
        int i=key%BUCKET;
        table.get(i).add(key);
    }
    void remove(int key){
        int i=key%BUCKET;
        table.get(i).remove((Integer)i);
    }
    boolean Search(int key){
        int i=key%BUCKET;
        return table.get(i).contains(key);
    }
     void display(){
        for(int i=0; i<BUCKET; i++){
            System.out.print("Bucket " + i + ": ");
            for(Integer key : table.get(i)){
                System.out.print(key + " -> ");
            }
            System.out.println("null");
        }
    }
}
public class Chaning{
    public static void main(String[] args) {
        int bucketSize = 7; 
        MyHash mh = new MyHash(bucketSize);
        System.out.println("--- Inserting keys ---");
        mh.insert(10); 
        mh.insert(4);  
        mh.insert(20); 
        mh.insert(15); 
        mh.insert(22); 
        mh.insert(33); 
        mh.display();

        System.out.println("\n--- Searching for keys ---");
        System.out.println("Searching for 20: " + mh.Search(20)); 
        System.out.println("Searching for 100: " + mh.Search(100)); 

        System.out.println("\n--- Removing keys ---");
        mh.remove(15);
        System.out.println("After removing 15:");
        mh.display();
        System.out.println("Searching for 15: " + mh.Search(15));
    }
}