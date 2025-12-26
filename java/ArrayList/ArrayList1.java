import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        //syntex for cresatig the array list in java 
        //here Integr is object 
        ArrayList<Integer> l1=new ArrayList<>();
        //add element
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        //get an element at index i
        System.out.println(l1.get(1));
        System.out.println(l1.get(3));
        System.out.println(l1.get(0));
        //print with the for loop
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        //printing the array list directly
        System.out.println(l1);
        //adding element at the some index i
        l1.add(1,20);
        System.out.println(l1);

        //modifying the element at the index i
        l1.set(1,100);
        System.out.println(l1);

        //removing the element at the index i
        l1.remove(1);
        System.out.println(l1);

        //removing an element e
        l1.remove(Integer.valueOf(2));//it has boolean return type
        System.out.println(l1);

        //checking if an element exixst
        boolean ans=l1.contains(Integer.valueOf(100));
        System.out.println(ans);

        //if you don,t specify class, you can put anyting inside l
        ArrayList l=new ArrayList();
        l.add(10);
        l.add("satyam");
        System.out.println(l);
    }
}
