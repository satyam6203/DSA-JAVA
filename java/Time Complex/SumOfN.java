//to find the sum of the N number with out using the loops

import java.util.Scanner;

public class SumOfN{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int n=sc.nextInt();
        sc.close();
        int sum=(n*(n+1))/2;
        System.out.println("the sum number upto ->"+n+" is ->"+sum);
    }
}