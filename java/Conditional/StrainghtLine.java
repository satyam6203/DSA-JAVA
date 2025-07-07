public class StrainghtLine {
    public static void main(String[] args) {
        int x1=1,x2=2,x3=3,y1=1,y2=2,y3=4;
        int m1=(x2-x1)/(y2-y1);
        int m2=(x3-x2)/(y3-y2);
        if(m1==m2){
            System.out.println("the given point is in the straight line.");
        }else{
            System.out.println("not in straight line.");
        }
    }
}
