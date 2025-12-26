import java.util.*;
public class RopeCutting {
    static int maxPice(int n,int a,int b,int c){
        if(n==0) return 0;
        if(n<0) return -1;
        int res=maxPice(n-a, a, b, c);
        int res2=maxPice(n-b, a, b, c);
        int res1=maxPice(n-c, a, b, c);
        int op=Math.max(res,Math.max(res1,res2));
        if(op==-1){
            return -1;
        }
        return op+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        System.out.println(maxPice(n, a, b, c));
    }
}
