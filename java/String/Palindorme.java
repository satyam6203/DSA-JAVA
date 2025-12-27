public class Palindorme {
    static void Method1(String s){
        StringBuilder sb=new StringBuilder(s);
        String org=s;
        sb.reverse();
        s=sb.toString();
        if(org.equals(s)){
            System.out.println("palindome");
        }
        else{
            System.out.println("not plaindrome");
        }
    }
    static boolean Method2(String s){
        int begin=0;
        int end=s.length()-1;
        while(begin<end){
            if(s.charAt(begin)!=s.charAt(end)){
                return false;
            }
            begin++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {
        
    }
}
