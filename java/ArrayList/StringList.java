import java.util.ArrayList;
import java.util.Collections;

public class StringList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("satyam");
        list.add("kumar");
        list.add("singh");
        list.add("golu");
        System.out.println("Original List :->"+list);
        Collections.sort(list);
        System.out.println("shorted list :->"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("reverse of the list :->"+list);
    }
}
