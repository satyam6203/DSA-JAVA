import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("pelse eneter the lucky number:");
        int number=sc.nextInt();
        sc.nextLine();
        System.out.println("enter your name :");
        String name=sc.nextLine();
        //next is use for to take only the line without the space
        String later=sc.next();
        System.out.println("you enter the "+later);

        //taking the char as a input 
        System.out.println("please enter the char:");
        char ch=sc.next().charAt(0);

        sc.close();
        System.out.println("you enter the number:"+number);
        System.out.println("your name is :"+name);
        System.out.println("cahr value is the :"+ch);
    }
}
