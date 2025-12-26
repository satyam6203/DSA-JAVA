import java.util.Scanner;

class Checker{
    boolean isPoli(String str,int start,int end){
        if(start>=end){
            return true;
        }
        return (str.charAt(start)==str.charAt(end)) && isPoli(str, start+1, end-1);
    }
}
public class Polindorom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        Checker ck=new Checker();
        int  start=0,end=st.length()-1;
        System.out.println(ck.isPoli(st, start, end));
    }
}
