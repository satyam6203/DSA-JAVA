public class LogicalOp {
    public static void main(String[] args) {
        int a=45;
        int b=18;
        System.out.println(a==b && a!=b);//first=false and secnod=true so result is false 
        System.out.println(a!=b && a>=b);//first=true and second=true so result is true 
        System.out.println(a==b || a!=b);//first=false and second=true so result is true 
        System.out.println(a!=b || a>=b);//first=true and second=true so result is true
        System.out.println(!(a==b)); //ans ir true
    }
}
