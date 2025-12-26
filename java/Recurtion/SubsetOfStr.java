import java.util.Scanner;

public class SubsetOfStr {
    static void subSet(String str,String curr,int i){
        if(i==str.length()){
            System.out.println(curr);
            return;
        }
        subSet(str, curr, i+1);
        subSet(str, curr+str.charAt(i), i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        subSet(st, "", 0);
    }
}
