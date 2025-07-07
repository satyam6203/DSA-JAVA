import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the percentage:");
        int percentage=sc.nextInt();
        sc.close();
        if(percentage>=90 && percentage<=100){
            System.out.println("Excellent");
        }else if(percentage>=80 && percentage<90){
            System.out.println("very good");
        }else if(percentage>=70 && percentage<80){
            System.out.println("Good");
        }else if(percentage>=60 && percentage<70){
            System.out.println("can do better");
        }else if(percentage>=50 && percentage<60){
            System.out.println("Average");
        }else if(percentage>=40 && percentage<50){
            System.out.println("Below average");
        }else if(percentage<40){
            System.out.println("fail");
        }
        else{
            System.out.println("inavlied percentage");
        }
    }
}
