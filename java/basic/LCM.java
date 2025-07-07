//LCM of the two number;

import java.util.Scanner;
class lcmOfTwoNumber{
    int lcmOfNumber(int a,int b){
        int res=Math.max(a, b);
        // int rec=max(a,b);
        while(true){
            if(res%a==0 && res%b==0){
                // return res;
                res++;
            }
            return res;
        }

    }
}
public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        lcmOfTwoNumber lc=new lcmOfTwoNumber();
        int res=lc.lcmOfNumber(a, b);
        System.out.println(res);
    }
}
