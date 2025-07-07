import java.util.Scanner;

public class AreaPeri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the length:");
        int lenght=sc.nextInt();
        System.out.println("please enter the breadth");
        int breadth=sc.nextInt();
        sc.close();
        int area=(lenght*breadth);
        int peri=2*(lenght + breadth);
        if(area>peri){
            System.out.println("area of the reactangle is greater than peri.");
        }else{
            System.out.println("perimeter is greater.");
        }
    }
}
