import java.util.Arrays;

public class Anagram{
    static boolean IsAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] st=s1.toCharArray();
        Arrays.sort(st);
        s1=new String(st);
        char[] st2=s2.toCharArray();
        Arrays.sort(st2);
        s2=new String(st2);
        return s1.equals(s2);
    }

    
    static final int CHAR=256;
    static boolean Method2(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        int count[]=new int[CHAR];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}