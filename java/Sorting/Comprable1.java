import java.util.Arrays;
import java.util.Comparator;

class MyCamp implements Comparator<Point>{
    @Override
    public int compare(Point p1,Point p2){
        return p1.x-p2.x;
    }
}
class Point{
    int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class Comprable1 {
    public static void main(String[] args) {
        Point arr[]={new Point(10, 20),new Point(3, 12),new Point(5, 7)};
        Arrays.sort(arr);
    }
}
